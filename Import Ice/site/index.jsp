<%@page import="donreba.ice.jsp.*,
				donreba.ice.jsp.xmler.*,
				org.jdom.*"%>
<%!
public class MySite extends SketchSite{	
	public void execute(){
		super.execute();
	}
}
%>
<%
MySite pg = new MySite();
pg.setContext(pageContext);
pg.execute();
%>