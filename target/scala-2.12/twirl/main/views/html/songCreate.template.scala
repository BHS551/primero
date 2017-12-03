
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

object songCreate extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Song],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(songForm : Form[Song]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.25*/("""
"""),_display_(/*3.2*/layout("Create Song")/*3.23*/{_display_(Seq[Any](format.raw/*3.24*/("""
    """),format.raw/*4.5*/("""<h1>create song</h1>
    """),_display_(/*5.6*/helper/*5.12*/.form(CSRF(routes.SongController.save()))/*5.53*/{_display_(Seq[Any](format.raw/*5.54*/("""
        """),_display_(/*6.10*/helper/*6.16*/.inputText(songForm("id"))),format.raw/*6.42*/("""
        """),_display_(/*7.10*/helper/*7.16*/.inputText(songForm("name"))),format.raw/*7.44*/("""
        """),_display_(/*8.10*/helper/*8.16*/.inputText(songForm("length"))),format.raw/*8.46*/("""
        """),_display_(/*9.10*/helper/*9.16*/.inputText(songForm("author"))),format.raw/*9.46*/("""

        """),format.raw/*11.9*/("""<input type="submit" value="submit changes">
    """)))}),format.raw/*12.6*/("""
""")))}))
      }
    }
  }

  def render(songForm:Form[Song]): play.twirl.api.HtmlFormat.Appendable = apply(songForm)

  def f:((Form[Song]) => play.twirl.api.HtmlFormat.Appendable) = (songForm) => apply(songForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Nov 05 20:49:55 COT 2017
                  SOURCE: C:/Users/551br/Documents/Repos/play/primero/app/views/songCreate.scala.html
                  HASH: 328f7742794f12708d4d2482dfe1f54e651f3bea
                  MATRIX: 957->1|1053->27|1098->24|1126->45|1155->66|1193->67|1225->73|1277->100|1291->106|1340->147|1378->148|1415->159|1429->165|1475->191|1512->202|1526->208|1574->236|1611->247|1625->253|1675->283|1712->294|1726->300|1776->330|1815->342|1896->393
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|37->5|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|43->11|44->12
                  -- GENERATED --
              */
          