
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/layout("App")/*1.15*/{_display_(Seq[Any](format.raw/*1.16*/("""

    """),format.raw/*3.5*/("""<div class="container">
        <div class="jumbotron">
            <h1>Bienvenido a mi App</h1>
            <h3>la de brayham...</h3>
            <h3>Construido usando mis manos</h3>
        </div>
    </div>

""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Dec 01 18:35:14 COT 2017
                  SOURCE: C:/Users/551br/Documents/Repos/play/primero/app/views/index.scala.html
                  HASH: 65514a71e7e7fe6c8ebe4faa1ee5c5b223c18f54
                  MATRIX: 1030->1|1051->14|1089->15|1123->23
                  LINES: 33->1|33->1|33->1|35->3
                  -- GENERATED --
              */
          