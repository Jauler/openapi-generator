package org.openapitools.client.api;

import org.openapitools.client.CollectionFormats.*;

import retrofit.Callback;
import retrofit.http.*;
import retrofit.mime.*;

import org.openapitools.client.model.Client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface AnotherFakeApi {
  /**
   * To test special tags
   * Sync method
   * To test special tags
   * @param client client model (required)
   * @return Client
   */
  
  @PATCH("/another-fake/dummy")
  Client testSpecialTags(
    @retrofit.http.Body Client client
  );

  /**
   * To test special tags
   * Async method
   * @param client client model (required)
   * @param cb callback method
   */
  
  @PATCH("/another-fake/dummy")
  void testSpecialTags(
    @retrofit.http.Body Client client, Callback<Client> cb
  );
}
