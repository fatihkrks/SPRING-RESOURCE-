package resource.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

public class ResourceClasspathTest {
public static void main(String[] args) throws IOException {
	ApplicationContext context= new ClassPathXmlApplicationContext();
	Resource resource=context.getResource("resource.properties");
	InputStream is=resource.getInputStream();
	Properties prop=new Properties();
	prop.load(is);
	String name=prop.getProperty("product.name");
	System.out.println(name);
	((ClassPathXmlApplicationContext) context).close();
}
}
