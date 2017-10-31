
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(nombre : String, Apellido: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any]()
      }
    }
  }

  def render(nombre:String,Apellido:String): play.twirl.api.HtmlFormat.Appendable = apply(nombre,Apellido)

  def f:((String,String) => play.twirl.api.HtmlFormat.Appendable) = (nombre,Apellido) => apply(nombre,Apellido)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 21 23:43:47 COT 2017
                  SOURCE: C:/Users/551br/Documents/Repos/play/primero/app/views/index.scala.html
                  HASH: 4a296f1300cec7a8932023ddc2ce121dc6ec2a92
                  MATRIX: 955->1
                  LINES: 28->1
                  -- GENERATED --
              */
          