//Your code here

if(args==null){
	args=[]
	args[0]=DeviceManager.getSpecificDevice( "MediumKat",{return null})
}
def cat = args[0]
println cat
class Jumper{
	private myInternalCat
	public Jumper(def myCat){
		myInternalCat=myCat
	}
	def jump(){
		println "Hello world"
		Thread.sleep(2000)
	}
}

return new Jumper(cat)