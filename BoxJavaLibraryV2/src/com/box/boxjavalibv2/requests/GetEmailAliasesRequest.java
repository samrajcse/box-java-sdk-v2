package com.box.boxjavalibv2.requests;

import com.box.boxjavalibv2.requests.requestobjects.BoxDefaultRequestObject;
import com.box.restclientv2.RestMethod;
import com.box.restclientv2.exceptions.BoxRestException;
import com.box.restclientv2.interfaces.IBoxConfig;
import com.box.restclientv2.requests.DefaultBoxRequest;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Retrieves all email aliases for this user. The collection of email aliases does not include the primary login for the user
 */
public class GetEmailAliasesRequest extends DefaultBoxRequest {

    private static final String URI = "/users/%s/email_aliases";

    /**
     * Constructor.
     * 
     * @param config
     *            config
     * @param objectMapper
     *            object mapper
     * @param userId
     *            id of user
     * @param requestObject
     *            request object
     * @throws BoxRestException
     *             exception
     */
    public GetEmailAliasesRequest(final IBoxConfig config, final ObjectMapper objectMapper, String userId, BoxDefaultRequestObject requestObject)
        throws BoxRestException {
        super(config, objectMapper, getUri(userId), RestMethod.GET, requestObject);
    }

    /**
     * Get uri.
     * 
     * @param userId
     *            id of user.
     * @return uri
     */
    public static String getUri(String userId) {
        return String.format(URI, userId);
    }
}
