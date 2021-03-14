package Train;
/* 1학년 자바 프로젝트 수행평가로 제작한 기차표 예매 프로그램
 * 제작기간 약 1달
 * 프로젝트 참여 인원 2명
 * */
public class TrainTest {
	Booking booking;
	Search search;
	
	public static void main(String[] args){
		TrainTest main = new TrainTest();
		
		main.search = new Search(); // 로그인창 보이기
        main.search.setMain(main);
        main.search.SearchFrame();
        
        main.booking = new Booking(main.search); // 로그인창 보이기
        main.booking.setMain(main);
        main.booking.BookingFrame(main.search);
        main.booking.dispose();
	}
	
	public void showBooking() {
		this.search.setVisible(false);
        this.booking.setVisible(true); 
	}
	public void showSearch() {
		this.booking.setVisible(false);
		this.search.setVisible(true);
	}
	
	public void End() {
		System.exit(0);
	}

}