package com.salesforce.multicloudj.registry.driver;

/**
 * Authentication strategy for OCI registry HTTP requests. Each cloud provider implements this
 * interface to supply the appropriate Authorization header for its registry.
 */
public interface RegistryAuthenticator {

  /**
   * Returns the HTTP Authorization header value for the given repository and auth challenge.
   *
   * @param challenge the auth challenge discovered from the registry's WWW-Authenticate response
   * @param repository the repository name (used for bearer token scope)
   * @param tokenExchange utility for OAuth2 bearer token exchange, if needed
   * @return the Authorization header value, or null for anonymous (no auth) access
   */
  String getAuthorizationHeader(
      AuthChallenge challenge, String repository, BearerTokenExchange tokenExchange);
}
