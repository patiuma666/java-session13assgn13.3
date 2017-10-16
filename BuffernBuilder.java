//to show how the capacity is changing in StringBuffer or in StringBuilder if we
//append the string.

package stringbufferstringbuilder;
//created package  
public class BuffernBuilder {
    //created class name as BuffernBuilder
	
	public static void main(String[] args) {
		//creating main method
		
		//Here creating string buffer
				StringBuffer str= new StringBuffer();
				
				// shows the initial capacity of StringBuffer 
					System.out.println("Initial capacity is : "+str.capacity());
					
					//using append once in this case also capacity of the buffer is 16
					str.append("Hello");
					System.out.println(str.capacity());
					
					//Now increasing the number of characters from current capacity
					str.append("We are ACADGILD Students");
					System.out.println(str.capacity());
					//Here  it increases the capacity by (oldcapacity*2)+2


	}

}
