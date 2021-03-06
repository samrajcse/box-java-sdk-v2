package com.box.boxjavalibv2.requests;

import junit.framework.Assert;

import org.apache.http.HttpStatus;
import org.junit.Test;

import com.box.boxjavalibv2.BoxConfig;
import com.box.boxjavalibv2.dao.BoxResourceType;
import com.box.boxjavalibv2.exceptions.AuthFatalFailureException;
import com.box.restclientv2.RestMethod;
import com.box.restclientv2.exceptions.BoxRestException;

public class DeleteTrashItemRequestTest extends RequestTestBase {

    @Test
    public void testUri() {
        String id = "12344";
        Assert.assertEquals("/folders/" + id + "/trash", DeleteTrashItemRequest.getUri(id, BoxResourceType.FOLDER));
    }

    @Test
    public void testFileRequestIsWellFormed() throws BoxRestException, AuthFatalFailureException {
        testRequestIsWellFormed(BoxResourceType.FILE);
    }

    @Test
    public void testFolderRequestIsWellFormed() throws BoxRestException, AuthFatalFailureException {
        testRequestIsWellFormed(BoxResourceType.FOLDER);
    }

    public void testRequestIsWellFormed(BoxResourceType type) throws BoxRestException, AuthFatalFailureException {
        String id = "testid123";

        DeleteTrashItemRequest request = new DeleteTrashItemRequest(CONFIG, OBJECT_MAPPER, id, type, null);
        testRequestIsWellFormed(request, BoxConfig.getInstance().getApiUrlAuthority(),
            BoxConfig.getInstance().getApiUrlPath().concat(DeleteTrashItemRequest.getUri(id, type)), HttpStatus.SC_NO_CONTENT, RestMethod.DELETE);
    }
}
