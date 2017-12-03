
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
/*1.2*/import java.util

object songIndex extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[util.List[Song],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(songs : util.List[Song]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.27*/("""
"""),_display_(/*3.2*/layout("All Songs")/*3.21*/{_display_(Seq[Any](format.raw/*3.22*/("""
    """),format.raw/*4.5*/("""<h1>All Songs</h1>
    """),_display_(/*5.6*/for(song <- songs) yield /*5.24*/{_display_(Seq[Any](format.raw/*5.25*/("""
        """),format.raw/*6.9*/("""<a class="btn btn-link" href=""""),_display_(/*6.40*/routes/*6.46*/.SongController.show(song.id)),format.raw/*6.75*/("""">"""),_display_(/*6.78*/song/*6.82*/.name),format.raw/*6.87*/("""</a>
        <p>Author: """),_display_(/*7.21*/song/*7.25*/.author),format.raw/*7.32*/(""" """),format.raw/*7.33*/("""</p>
        <p>Length: """),_display_(/*8.21*/song/*8.25*/.length),format.raw/*8.32*/(""" """),format.raw/*8.33*/("""</p>
    """)))}),format.raw/*9.6*/("""
    """),format.raw/*10.5*/("""<a class="btn btn-outline-dark" href=""""),_display_(/*10.44*/routes/*10.50*/.SongController.create()),format.raw/*10.74*/("""">

        Create song
    </a>
""")))}))
      }
    }
  }

  def render(songs:util.List[Song]): play.twirl.api.HtmlFormat.Appendable = apply(songs)

  def f:((util.List[Song]) => play.twirl.api.HtmlFormat.Appendable) = (songs) => apply(songs)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Dec 02 21:33:54 COT 2017
                  SOURCE: C:/Users/551br/Documents/Repos/play/primero/app/views/songIndex.scala.html
                  HASH: 2185cb7aae08eb98fa36504185bffcacc2ba6a21
                  MATRIX: 651->1|985->20|1105->45|1133->48|1160->67|1198->68|1230->74|1280->99|1313->117|1351->118|1387->128|1444->159|1458->165|1507->194|1536->197|1548->201|1573->206|1625->232|1637->236|1664->243|1692->244|1744->270|1756->274|1783->281|1811->282|1851->293|1884->299|1950->338|1965->344|2010->368
                  LINES: 24->1|29->2|34->2|35->3|35->3|35->3|36->4|37->5|37->5|37->5|38->6|38->6|38->6|38->6|38->6|38->6|38->6|39->7|39->7|39->7|39->7|40->8|40->8|40->8|40->8|41->9|42->10|42->10|42->10|42->10
                  -- GENERATED --
              */
          