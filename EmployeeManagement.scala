class NewEmp
{ 
  var FNAME : String = " "
  var LNAME : String = " "
  var DOB : String = " "
  var Qal : Int = " "
  var MNo : Long = 0
  var Email : String = " "
  var Ctc : Int = 0
  var HouseNumber : Int = 0
  var AddLine1 : String = " "
  var AddLine2 : String = " "
  var City : String = " "
  var State : String = " "
  var Country : String = " "
  var Pincode : Int = 0
  
  def add(a:String,b:String,c:String,d:String,e:Long,f:String,g:Int, h:Int,i:String,j:String,k:String,l:String,m:String,n:Int)
  {
    
    FNAME = a
    LNAME = b
    DOB = c
    Qal = d
    MNo = e
    Email = f
    Ctc = g
    HouseNumber = h
    AddLine1 = i
    AddLine2 = j
    City = k
    State = l
    Country = m
    Pincode = n
  }
 def display()
 {
   println("The First Name is: " +FNAME)
   println("The Last Nmae is: " + LNAME)
   println("The House Number is: " + DOB)
   println("The First Name is: " + Qal)
   println("The Last Nmae is: " + MNo)
   println("The House Number is: " + Email)
   println("The First Name is: " + Ctc)
   println("The Last Nmae is: " + HouseNumber)
   println("The House Number is: " + AddLine1)
   println("The First Name is: " + AddLine2)
   println("The Last Nmae is: " + City)
   println("The House Number is: " + State)
   println("The House Number is: " + Country)
   println("The House Number is: " + Pincode)

   
 }

     
}
trait MyTrait
{
  def Sal(salary: Double)
}
class MyClass 
{
  var PF : Double = 0
  def Sal(salary: Double)
  {
    PF = 2.5/100 * salary
    println("Calculated PF: " + PF)
  }
}
class developer(var bonus : Int) extends NewEmp 
{
 println("Bonus for the developer=" +bonus)
}
class manager(var organization : String) extends NewEmp
{
 println("Organization the manager is working in =" +organization)
}
object Task
{
  def main(args: Array[String])
  {
    val obj = new NewEmp();
    
    obj.add("Tabinda", "Hilal", "02-01-1888","B.E",99999999,"tabin@gmail.com",30000,274,"Kashmir","Srinsgar","Bag","Sri","India",19888)
    obj.display()
    val oob =new MyClass()
    oob.Sal(30000)
    val dd = new developer(5000)
    dd.add("Ankit", "RRR", "11-01-1888","M.E",99998999,"ank@gmail.com",35500,4,"MP","Srr","Bag","Sridd","India",89888)
    dd.display()
    val mm = new manager("DDDD")
    mm.add("Mahesh", "Rana", "12-01-1880","P.h.d",99888999,"Mahesh@gmail.com",80000,7,"Delhi","Moha","Bagaash","Govind","India",11888)
    mm.display()
  }
}