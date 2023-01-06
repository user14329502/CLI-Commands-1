// package prj.springBootRestApi.CLICommands1.apiDocumentation;
//
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.web.ServerProperties;
//import org.springframework.core.io.Resource;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//
//import java.util.Objects;
//
//@Controller
//public class CustomOpenApiUiController {
//
//    @Value("classpath:swagger-ui.css")
//    private Resource cssFile;
//
//    @GetMapping(value = "/swagger-ui/swagger-ui.css")
//    public void resourceCSS(HttpServletRequest request, HttpServletResponse response) {
//        setResource(cssFile, response, "text/css;charset=UTF-8");
//    }
//
//    private void setResource(Resource resource, HttpServletResponse response, String contentType) {
//        try {
//            response.setHeader("content-type", contentType);
//            response.setHeader("Pragma", "no-cache");
//            byte[] file = resource.getURI().getPath().getBytes("UTF-8");
//            response.getOutputStream().write(file);
//        } catch (Exception e) {
//            assert(true);
//        }
//    }
//}
