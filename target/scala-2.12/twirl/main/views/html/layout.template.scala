
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

object layout extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(tittle : String)(body: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.31*/("""
"""),format.raw/*2.1*/("""<html>
    <head>
        <title>"""),_display_(/*4.17*/tittle),format.raw/*4.23*/("""</title>
    </head>
    <body>
        """),_display_(/*7.10*/body),format.raw/*7.14*/("""
    """),format.raw/*8.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(tittle:String,body:Html): play.twirl.api.HtmlFormat.Appendable = apply(tittle)(body)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (tittle) => (body) => apply(tittle)(body)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 21 21:07:10 COT 2017
                  SOURCE: C:/Users/551br/OneDrive/Documents/Play/primero/app/views/layout.scala.html
                  HASH: a30eab7be94c76133069cf0267f3a25b0312414b
                  MATRIX: 954->1|1078->30|1106->32|1168->68|1194->74|1264->118|1288->122|1320->128
                  LINES: 28->1|33->1|34->2|36->4|36->4|39->7|39->7|40->8
                  -- GENERATED --
              */
          