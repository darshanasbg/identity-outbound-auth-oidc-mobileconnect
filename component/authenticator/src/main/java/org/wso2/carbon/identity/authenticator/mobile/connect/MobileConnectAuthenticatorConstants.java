package org.wso2.carbon.identity.authenticator.mobile.connect;

/**
 * Created by keetmalin on 8/26/16.
 */
public class MobileConnectAuthenticatorConstants {

    //Constants related to the overall mobile connect properties
    public static final String AUTHENTICATOR_NAME = "MobileConnectAuthenticator";
    public static final String AUTHENTICATOR_FRIENDLY_NAME = "Mobile Connect";
    public static final String MOBILE_CONNECT_API_KEY = "APIKey";
    public static final String MOBILE_CONNECT_API_SECRET = "APISecret";
    public static final String CLAIM_ID = "id";
    public static final String DEFAULT_USER_IDENTIFIER = "id";
   public static final String DISCOVERY_API_URL = "https://discover.mobileconnect.io/sb1/v2/discovery";
//    public static final String DISCOVERY_API_URL = "http://localhost/test_folder/discovery.php";

    //Constants related to Disovery API MNC, MCC access
    public static final String DISCOVERY_IDENTIFIED_MCC = "Identified-MCC";
    public static final String DISCOVERY_IDENTIFIED_MNC = "Identified-MNC";
    public static final String DISCOVERY_IGNORE_COOKIES = "Ignore-Cookies";
    public static final String DISCOVERY_LOCAL_IP = "Local-Client-IP";
    public static final String DISCOVERY_SET_COOKIES = "Set-Cookies";

    //constants related to session management
    public static final String MOBILE_CONNECT_SESSION_DATA_KEY = "sessionDataKey";
    public static final String MOBILE_CONNECT_CONTEXT_IDENTIFIER = "contextIdentifier";
    public static final String MOBILE_CONNECT_COMMONAUTH_IDP = "idp";
    public static final String MOBILE_CONNECT_COMMONAUTH_AUTHENTICATOR = "authenticator";
    public static final String MOBILE_CONNECT_COMMONAUTH_SDK = "sessionDataKey";
    public static final String MOBILE_CONNECT_CALLBACK_URL = "https://localhost:9443/commonauth";

    //Constants related to the state of the process
    public static final String MOBILE_CONNECT_SESSION_STATE = "state";
    public static final String MOBILE_CONNECT_DISCOVERY = "discovery";
    public static final String MOBILE_CONNECT_AUTHORIZATION_ENDPOINT = "authorization_endpoint";
    public static final String MOBILE_CONNECT_TOKEN_ENDPOINT = "token_endpoint";
    public static final String MOBILE_CONNECT_USERINFO_ENDPOINT = "userinfo_endpoint";

    //constants related to Discovery API Connection
    public static final String MOBILE_CONNECT_DISCOVERY_AUTHORIZATION = "Authorization";
    public static final String MOBILE_CONNECT_DISCOVERY_ACCEPT = "Accept";
    public static final String MOBILE_CONNECT_DISCOVERY_CONTENT_TYPE = "Content-Type";
    public static final String MOBILE_CONNECT_DISCOVERY_MSISDN = "MSISDN";
    public static final String MOBILE_CONNECT_DISCOVERY_REDIRECT_URL = "Redirect_URL";
    public static final String MOBILE_CONNECT_DISCOVERY_JSON_OBJECT = "response";
    public static final String MOBILE_CONNECT_RESPONSE_STATE = "statusCode";
    public static final String MOBILE_CONNECT_USING_MOBILE_DATA = "X-Using-Mobile-Data";

    //constants related to the Authorization Endpoint Connection
    public static final String MOBILE_CONNECT_AUTHORIZATION_CLIENT_ID = "client_id";
    public static final String MOBILE_CONNECT_AUTHORIZATION_RESPONSE_TYPE = "response_type";
    public static final String MOBILE_CONNECT_AUTHORIZATION_SCOPE = "scope";
    public static final String MOBILE_CONNECT_AUTHORIZATION_REDIRECT_URI = "redirect_uri";
    public static final String MOBILE_CONNECT_AUTHORIZATION_ARC_VALUES= "acr_values";
    public static final String MOBILE_CONNECT_AUTHORIZATION_STATE = "state";
    public static final String MOBILE_CONNECT_AUTHORIZATION_NONCE = "nonce";

    //constants related to the Token endpoint connection
    public static final String MOBILE_CONNECT_TOKEN_AUTHORIZATION = "Authorization";
    public static final String MOBILE_CONNECT_TOKEN_CONTENT_TYPE = "Content-Type";
    public static final String MOBILE_CONNECT_TOKEN_CODE = "code";
    public static final String MOBILE_CONNECT_TOKEN_GRANT_TYPE = "grant_type";
    public static final String MOBILE_CONNECT_TOKEN_REDIRECT_URI = "redirect_uri";



}