package IteratorPattern;

public interface Iterator {
	public boolean hasNext();
	//배결의 크기만큼 반복문을 놀리기위한 함수의 형태
	public Object next();
	//다음 오브젝트 값을 가져오기 위한 함수의 형태
	public void remove();
	//값을 삭제하기 위한 함수의 형태
}
