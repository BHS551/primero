
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

object songShow extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Song,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(song : Song):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.15*/("""
"""),_display_(/*2.2*/layout(song.name)/*2.19*/{_display_(Seq[Any](format.raw/*2.20*/("""

    """),format.raw/*4.5*/("""<h2>"""),_display_(/*4.10*/song/*4.14*/.name),format.raw/*4.19*/("""</h2>
    <h3>author: </h3>

    <p>"""),_display_(/*7.9*/song/*7.13*/.author),format.raw/*7.20*/("""</p>

    <h3>length: </h3>

    <p>"""),_display_(/*11.9*/song/*11.13*/.length),format.raw/*11.20*/("""</p>

    <a href=""""),_display_(/*13.15*/routes/*13.21*/.SongController.edit(song.id)),format.raw/*13.50*/("""">Edit</a>
    <a href=""""),_display_(/*14.15*/routes/*14.21*/.SongController.destroy(song.id)),format.raw/*14.53*/("""">Delete</a>
""")))}))
      }
    }
  }

  def render(song:Song): play.twirl.api.HtmlFormat.Appendable = apply(song)

  def f:((Song) => play.twirl.api.HtmlFormat.Appendable) = (song) => apply(song)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 21 22:39:17 COT 2017
                  SOURCE: C:/Users/551br/OneDrive/Documents/Play/primero/app/views/songShow.scala.html
                  HASH: 9f510f393912325a3aab087cde9fbc9c5cec2775
                  MATRIX: 949->1|1057->14|1085->17|1110->34|1148->35|1182->43|1213->48|1225->52|1250->57|1315->97|1327->101|1354->108|1421->149|1434->153|1462->160|1511->182|1526->188|1576->217|1629->243|1644->249|1697->281
                  LINES: 28->1|33->1|34->2|34->2|34->2|36->4|36->4|36->4|36->4|39->7|39->7|39->7|43->11|43->11|43->11|45->13|45->13|45->13|46->14|46->14|46->14
                  -- GENERATED --
              */
          