
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

        <link rel="stylesheet" media="screen" href=""""),_display_(/*6.54*/routes/*6.60*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*6.110*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*7.54*/routes/*7.60*/.Assets.versioned("stylesheets/styles.css")),format.raw/*7.103*/("""">

        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.versioned("images/favicon.png")),format.raw/*9.104*/("""">

    </head>
    <body>
        <header>
            <nav class="navbar navbar-light bg-light navbar-expand-lg navbar-dark bg-dark">
                <a class="navbar-brand" href=""""),_display_(/*15.48*/routes/*15.54*/.HomeController.index()),format.raw/*15.77*/("""">App</a>
                <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#exnav" aria-controls="exnav" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
                <div id="exnav" class="collapse navbar-collapse">
                    <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                        <li class="nav-item">
                            <a class="nav-link" href=""""),_display_(/*22.56*/routes/*22.62*/.SongController.index()),format.raw/*22.85*/("""">All Songs</a>
                        </li>
                        <li class="nav-item">
                            <a class="nav-link" href=""""),_display_(/*25.56*/routes/*25.62*/.SongController.create()),format.raw/*25.86*/("""" >Create Songs</a>
                        </li>

                    </ul>
                </div>
            </nav>
        </header>

        <div class="container">
            """),_display_(/*34.14*/body),format.raw/*34.18*/("""
        """),format.raw/*35.9*/("""</div>

        <script src=""""),_display_(/*37.23*/routes/*37.29*/.Assets.versioned("js/jquery-3.2.1.min.js")),format.raw/*37.72*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*38.23*/routes/*38.29*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*38.69*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*39.23*/routes/*39.29*/.Assets.versioned("js/bootstrap.bundle.min.js")),format.raw/*39.76*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*40.23*/routes/*40.29*/.Assets.versioned("js/custom.js")),format.raw/*40.62*/("""" type="text/javascript"></script>
    </body>
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
                  DATE: Fri Dec 01 19:46:35 COT 2017
                  SOURCE: C:/Users/551br/Documents/Repos/play/primero/app/views/layout.scala.html
                  HASH: 3d540d61b52b11ca6fa07f52d66dcb93ec2d0e1a
                  MATRIX: 954->1|1078->30|1106->32|1168->68|1194->74|1285->139|1299->145|1370->195|1453->252|1467->258|1531->301|1621->365|1635->371|1695->410|1911->599|1926->605|1970->628|2515->1146|2530->1152|2574->1175|2751->1325|2766->1331|2811->1355|3030->1547|3055->1551|3092->1561|3151->1593|3166->1599|3230->1642|3315->1700|3330->1706|3391->1746|3476->1804|3491->1810|3559->1857|3644->1915|3659->1921|3713->1954
                  LINES: 28->1|33->1|34->2|36->4|36->4|38->6|38->6|38->6|39->7|39->7|39->7|41->9|41->9|41->9|47->15|47->15|47->15|54->22|54->22|54->22|57->25|57->25|57->25|66->34|66->34|67->35|69->37|69->37|69->37|70->38|70->38|70->38|71->39|71->39|71->39|72->40|72->40|72->40
                  -- GENERATED --
              */
          