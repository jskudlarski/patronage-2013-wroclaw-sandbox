package controllers

import play.api._
import play.api.mvc._
import scala.util.Random.shuffle

import models.NQueens._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index("Time start!!!"))
  }
  
  def nqueens = Action {
    Ok(views.html.nqueens(shuffle(EightQueensSolution) head))
  }
}
