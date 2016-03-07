//aim is to count words in a file

class reader{
	fileReader input = new fileReader("file.txt");
	parser p = new parser();
	array = new ArrayList(5);
	input x;
	void read(){
		while (input.hasNextLine()){
			x = fileReader.read();
			array.add(x);
		}
	}
}

public class parser{
	int amount;
	reader r = new reader;
	void parse(){
		r.read();
		//r.array
		
		
	}
	
}