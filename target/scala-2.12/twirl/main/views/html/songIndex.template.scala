
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

object songIndex extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Set[Song],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(songs : Set[Song]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.21*/("""
"""),_display_(/*2.2*/layout("All Songs")/*2.21*/{_display_(Seq[Any](format.raw/*2.22*/("""
    """),format.raw/*3.5*/("""<h1>All Songs</h1>
    """),_display_(/*4.6*/for(song <- songs) yield /*4.24*/{_display_(Seq[Any](format.raw/*4.25*/("""
        """),format.raw/*5.9*/("""<a href=""""),_display_(/*5.19*/routes/*5.25*/.SongController.show(song.id)),format.raw/*5.54*/("""">"""),_display_(/*5.57*/song/*5.61*/.name),format.raw/*5.66*/("""</a>
        <p>Author: """),_display_(/*6.21*/song/*6.25*/.author),format.raw/*6.32*/(""" """),format.raw/*6.33*/("""</p>
        <p>Length: """),_display_(/*7.21*/song/*7.25*/.length),format.raw/*7.32*/(""" """),format.raw/*7.33*/("""</p>
    """)))}),format.raw/*8.6*/("""
    """),format.raw/*9.5*/("""<a href=""""),_display_(/*9.15*/routes/*9.21*/.SongController.create()),format.raw/*9.45*/("""">Create song</a>
""")))}))
      }
    }
  }

  def render(songs:Set[Song]): play.twirl.api.HtmlFormat.Appendable = apply(songs)

  def f:((Set[Song]) => play.twirl.api.HtmlFormat.Appendable) = (songs) => apply(songs)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 21 21:09:04 COT 2017
                  SOURCE: C:/Users/551br/OneDrive/Documents/Play/primero/app/views/songIndex.scala.html
                  HASH: a07444f89e3899cbe2c2c2534d6fae2aac18e671
                  MATRIX: 955->1|1069->20|1097->23|1124->42|1162->43|1194->49|1244->74|1277->92|1315->93|1351->103|1387->113|1401->119|1450->148|1479->151|1491->155|1516->160|1568->186|1580->190|1607->197|1635->198|1687->224|1699->228|1726->235|1754->236|1794->247|1826->253|1862->263|1876->269|1920->293
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|36->4|36->4|36->4|37->5|37->5|37->5|37->5|37->5|37->5|37->5|38->6|38->6|38->6|38->6|39->7|39->7|39->7|39->7|40->8|41->9|41->9|41->9|41->9
                  -- GENERATED --
              */
          