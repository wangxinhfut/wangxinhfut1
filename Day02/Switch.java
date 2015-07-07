package wangxin;
public class Switch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int goodsNumber=3;
		switch(goodsNumber){
		case 1:
			System.out.println("此商品属于食品分部");
			break;
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("此商品属于百货分部");
			break;
			default:
				System.out.println("w无此商品编号");
			break;
			}

	}

}
