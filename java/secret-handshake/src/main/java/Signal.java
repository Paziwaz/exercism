enum Signal {

    WINK(0b1),
	DOUBLE_BLINK(0b10),
	CLOSE_YOUR_EYES(0b100), 
	JUMP(0b1000);
	
	private int code;
	
	Signal(int code){
		this.code = code;
	}
	
	int getCode(){
		return code;
	}
}
