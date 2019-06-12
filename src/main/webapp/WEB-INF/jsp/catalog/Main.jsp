<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/12/7
  Time: 21:07
  To change this template use File | Settings | File Templates.
--%>
<%@ include file="../common/IncludeTop.jsp"%>

<div id="Welcome">
    <div id="WelcomeContent">
       <c:if test="${account==null}"><s:text name="welcome" /></c:if>
    </div>
</div>

<div id="Main">
    <div id="Sidebar">
        <div id="SidebarContent">
            <a href="viewCategory?categoryID=FISH"><img src="../../../images/fish_icon.gif" /></a>
            <br/> <s:text name="fishMessage" /> <br/>
            <a href="viewCategory?categoryID=DOGS"><img src="../../../images/dogs_icon.gif" /></a>
            <br /> <s:text name="dogMessage" /> <br />
            <a href="viewCategory?categoryID=CATS"><img src="../../../images/cats_icon.gif" /></a>
            <br /> <s:text name="catMessage" /> <br />
            <a href="viewCategory?categoryID=REPTILES"><img src="../../../images/reptiles_icon.gif" /></a>
            <br /> <s:text name="reptileMessage" /> <br />
            <a href="viewCategory?categoryID=BIRDS"><img src="../../../images/birds_icon.gif" /></a>
            <br /> <s:text name="birdMessage" />
        </div>
    </div>

    <div id="MainImage">
        <div id="MainImageContent">
            <map name="estoremap">
                <area alt="Birds" coords="72,2,280,250" href="viewCategory?categoryID=BIRDS" shape="rect" />
                <area alt="Fish" coords="2,180,72,250" href="viewCategory?categoryID=FISH" shape="rect" />
                <area alt="Dogs" coords="60,250,130,320" href="viewCategory?categoryID=DOGS" shape="rect" />
                <area alt="Reptiles" coords="140,270,210,340" href="viewCategory?categoryID=REPTILES" shape="rect" />
                <area alt="Cats" coords="225,240,295,310" href="viewCategory?categoryID=CATS" shape="rect" />
                <area alt="Birds" coords="280,180,350,250" href="viewCategory?categoryID=BIRDS" shape="rect" />
            </map>
            <img height="355" src="images/splash.gif" align="middle" usemap="#estoremap" width="350" />
        </div>
    </div>
    <div id="Separator">&nbsp;</div>
</div>


<%@ include file="../common/IncludeBottom.jsp"%>