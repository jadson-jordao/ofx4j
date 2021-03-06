/*
 * Copyright 2008 Web Cohesion
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.webcohesion.ofx4j.client.impl;

import com.webcohesion.ofx4j.OFXException;
import com.webcohesion.ofx4j.client.FinancialInstitution;
import com.webcohesion.ofx4j.client.FinancialInstitutionData;
import com.webcohesion.ofx4j.client.FinancialInstitutionDataStore;
import com.webcohesion.ofx4j.client.FinancialInstitutionProfile;
import com.webcohesion.ofx4j.domain.data.RequestEnvelope;
import com.webcohesion.ofx4j.domain.data.ResponseEnvelope;
import com.webcohesion.ofx4j.client.net.OFXConnectionException;
import com.webcohesion.ofx4j.client.net.OFXV1Connection;

import java.io.*;
import java.net.URL;

/**
 * @author Ryan Heaton
 * @author Scott Priddy
 */
public class FIProfileRequestDump {

  public static void main(final String[] args) throws Exception {
    if (args.length < 2) {
      System.out.println("Usage: FIProfileRequestDump <fid> <outFile>");
      System.exit(1);
    }
    FinancialInstitutionDataStore dataStore = new LocalResourceFIDataStore();
    final FinancialInstitutionData fiData = dataStore.getInstitutionData(args[0]);
    OFXV1Connection connection = new OFXV1Connection() {
      @Override
      protected InputStream sendBuffer(URL url, ByteArrayOutputStream outBuffer) throws IOException, OFXConnectionException {
        File file = new File(args[1]);
        System.out.println("Writing " + outBuffer.size() + " bytes to " + file.getAbsolutePath() + " for request to " + fiData.getOFXURL() + "...");
        FileOutputStream outFile = new FileOutputStream(file);
        outFile.write(outBuffer.toByteArray());
        return null;
      }

      @Override
      protected ResponseEnvelope unmarshal(InputStream in) throws IOException, OFXConnectionException {
        return null;
      }
    };

    FinancialInstitution fi = new FinancialInstitutionImpl(fiData, connection) {
      @Override
      protected FinancialInstitutionProfile getProfile(ResponseEnvelope response) throws OFXException {
        return null;
      }

      @Override
      protected void doGeneralValidationChecks(RequestEnvelope request, ResponseEnvelope response) throws OFXException {
        // overriding the validation checking, since we're passing null response objects around.
      }
    };
    fi.readProfile();
  }
}