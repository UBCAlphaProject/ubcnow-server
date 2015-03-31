package models
import scala.util.parsing.json

case class Blip(
    id: Option[Long],
    gid: Option[Long],
    title: Option[String],
    summary: Option[String],
    link: Option[String],
    startTime: Option[String],
    endTime: Option[String],
    address: Option[String],
    lat: Option[Double],
    lng: Option[Double]
)
