package controllers

import play.api._
import play.api.mvc._
import scala.util.Random.shuffle

import models.NQueens._

object Application extends Controller {
  
  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }
  
  def nqueens = Action {
    Ok(views.html.nqueens(shuffle(EightQueensSolution) head))
  }
  
  def atest = Action {
	Ok("This is just a test")
  }
}
