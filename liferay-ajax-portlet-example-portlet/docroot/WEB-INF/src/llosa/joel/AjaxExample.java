package llosa.joel;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.util.PortalUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet example that accepts an AJAX request and return a JSON string. With
 * the method, HTTP GET and POST will not reload the entire page.
 * 
 * @author Joel Patrick Llosa
 */
public class AjaxExample extends MVCPortlet {
	
	/**
	 * This is what the AJAX request hits.
	 */
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse) throws IOException, PortletException {
		UploadPortletRequest uploadRequest = PortalUtil.getUploadPortletRequest(resourceRequest);
		String name = ParamUtil.getString(uploadRequest, "name");

		resourceResponse.getWriter().print("{ \"name\" : \"" + name + "\"}");
	}
}
