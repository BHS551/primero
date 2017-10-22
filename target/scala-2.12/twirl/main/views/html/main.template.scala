
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /* * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*6.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.32*/("""

"""),format.raw/*8.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*11.62*/("""
        """),format.raw/*12.9*/("""<title>"""),_display_(/*12.17*/title),format.raw/*12.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*13.54*/routes/*13.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*13.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*14.59*/routes/*14.65*/.Assets.versioned("images/favicon.png")),format.raw/*14.104*/("""">
    </head>
    <body>
        """),format.raw/*18.32*/("""
        """),_display_(/*19.10*/content),format.raw/*19.17*/("""

        """),format.raw/*21.9*/("""<script src=""""),_display_(/*21.23*/routes/*21.29*/.Assets.versioned("javascripts/main.js")),format.raw/*21.69*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Oct 11 19:51:17 COT 2017
                  SOURCE: C:/Users/551br/OneDrive/Documents/Play/primero/app/views/main.scala.html
                  HASH: 568312800d159b6e25e707fb64770a24d31f8166
                  MATRIX: 1209->264|1334->294|1364->298|1447->406|1484->416|1519->424|1545->429|1635->492|1650->498|1713->539|1802->601|1817->607|1878->646|1943->774|1981->785|2009->792|2048->804|2089->818|2104->824|2165->864
                  LINES: 32->6|37->6|39->8|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|48->18|49->19|49->19|51->21|51->21|51->21|51->21
                  -- GENERATED --
              */
          