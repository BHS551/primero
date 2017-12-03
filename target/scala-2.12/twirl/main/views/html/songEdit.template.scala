
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

object songEdit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[Song],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(songForm: Form[Song]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
/*2.2*/import helper._


Seq[Any](format.raw/*1.24*/("""
"""),_display_(/*3.2*/layout("Edit Song")/*3.21*/{_display_(Seq[Any](format.raw/*3.22*/("""<h1>edit song</h1>
    """),_display_(/*4.6*/helper/*4.12*/.form(CSRF(routes.SongController.update()))/*4.55*/{_display_(Seq[Any](format.raw/*4.56*/("""
        """),_display_(/*5.10*/helper/*5.16*/.inputText(songForm("id"))),format.raw/*5.42*/("""
        """),_display_(/*6.10*/helper/*6.16*/.inputText(songForm("name"))),format.raw/*6.44*/("""
        """),_display_(/*7.10*/helper/*7.16*/.inputText(songForm("length"))),format.raw/*7.46*/("""
        """),_display_(/*8.10*/helper/*8.16*/.inputText(songForm("author"))),format.raw/*8.46*/("""

        """),format.raw/*10.9*/("""<input type="submit" value="Submit Changes">
    """)))}),format.raw/*11.6*/("""
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
                  DATE: Sun Nov 05 20:56:50 COT 2017
                  SOURCE: C:/Users/551br/Documents/Repos/play/primero/app/views/songEdit.scala.html
                  HASH: 44b57aac03831f081de270c641617c45e06de2c2
                  MATRIX: 955->1|1050->26|1095->23|1123->44|1150->63|1188->64|1238->89|1252->95|1303->138|1341->139|1378->150|1392->156|1438->182|1475->193|1489->199|1537->227|1574->238|1588->244|1638->274|1675->285|1689->291|1739->321|1778->333|1859->384
                  LINES: 28->1|31->2|34->1|35->3|35->3|35->3|36->4|36->4|36->4|36->4|37->5|37->5|37->5|38->6|38->6|38->6|39->7|39->7|39->7|40->8|40->8|40->8|42->10|43->11
                  -- GENERATED --
              */
          