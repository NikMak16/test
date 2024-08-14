package telran.java53.service;

public class TestServiceImpl implements TestService {

	@Override
	public Object create(Object object) {
		return new Object();
	}

	@Override
	public Object read() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Numner " + i);
		}
		return null;
	}

	@Override
	public boolean update(Object object) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
