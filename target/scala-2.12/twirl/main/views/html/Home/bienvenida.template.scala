
package views.html.Home

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

object bienvenida extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(nombre: String , lastname: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.37*/("""

"""),format.raw/*3.1*/("""<html>
	<head>
	<Tittle></Tittle>
	<head>
</html>"""))
      }
    }
  }

  def render(nombre:String,lastname:String): play.twirl.api.HtmlFormat.Appendable = apply(nombre,lastname)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (nombre,lastname) => apply(nombre,lastname)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Nov 01 15:35:52 COT 2017
                  SOURCE: C:/Users/551br/Documents/Repos/play/primero/app/views/Home/bienvenida.scala.html
                  HASH: 610eccf48f1153ff16c3894677e9e4fba21b0b52
                  MATRIX: 965->1|1095->36|1125->40
                  LINES: 28->1|33->1|35->3
                  -- GENERATED --
              */
          