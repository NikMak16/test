package telran.java53.service;

public class TestServiceImpl implements TestService {

	@Override
	public Object create(Object object) {
		return new Object();
	}

	@Override
	public Object read() {
		System.out.println("print 1");
		System.out.println("print 2");
		System.out.println("print 3");
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
