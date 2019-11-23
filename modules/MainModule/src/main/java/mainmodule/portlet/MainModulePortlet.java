package mainmodule.portlet;

import mainmodule.constants.MainModulePortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.graalvm.compiler.core.GraalCompiler;
import org.osgi.service.component.annotations.Component;

/**
 * @author thedi
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=MainModule",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + MainModulePortletKeys.MAINMODULE,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class MainModulePortlet extends MVCPortlet {
	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) {

		return "/blogs/view.jsp";
	}
}