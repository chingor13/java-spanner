/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/spanner/admin/database/v1/common.proto

package com.google.spanner.admin.database.v1;

public interface EncryptionConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.spanner.admin.database.v1.EncryptionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the Cloud KMS key that was used to encrypt and decrypt
   * the database. The form of the kms_key_name is
   * `projects/&lt;project&gt;/locations/&lt;location&gt;/keyRings/&lt;key_ring&gt;/cryptoKeys&#92;
   * /&lt;kms_key_name&gt;`.
   * api-linter: core::0122::name-suffix=disabled
   * aip.dev/not-precedent: crypto key identifiers like this are listed as a
   * canonical example of when field names would be ambiguous without the
   * _name suffix and should therefore include it.
   * </pre>
   *
   * <code>string kms_key_name = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The kmsKeyName.
   */
  java.lang.String getKmsKeyName();
  /**
   *
   *
   * <pre>
   * The resource name of the Cloud KMS key that was used to encrypt and decrypt
   * the database. The form of the kms_key_name is
   * `projects/&lt;project&gt;/locations/&lt;location&gt;/keyRings/&lt;key_ring&gt;/cryptoKeys&#92;
   * /&lt;kms_key_name&gt;`.
   * api-linter: core::0122::name-suffix=disabled
   * aip.dev/not-precedent: crypto key identifiers like this are listed as a
   * canonical example of when field names would be ambiguous without the
   * _name suffix and should therefore include it.
   * </pre>
   *
   * <code>string kms_key_name = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for kmsKeyName.
   */
  com.google.protobuf.ByteString getKmsKeyNameBytes();
}