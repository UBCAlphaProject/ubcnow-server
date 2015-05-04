package models

case class User (
  id: Long,
  studentNumber: Long,
  givenName: String,
  sn: String,
  interests: List[Long] = List[Long](),
  groups: List[Long] = List[Long]()
)
