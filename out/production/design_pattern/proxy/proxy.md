프록시 패턴의 중요 포인트
1. 대리자는 실제 서비스와 같은 이름의 메서드를 구현. 인터페이스를 사용함
2. 대리자는 실제 서비스에 대한 참조 변수를 갖는다(합성)
3. 대리자는 실제 서비스의 같은 이름을 가진 메서드를 호출하고 그 값을 클라이언트에게 돌려준다.
4. 대리자는 실제 서비스의 메서드 호출 전후에 별도의 로직을 수행할 수도 있다.

> 제어 흐름을 조정하기 위한 목적으로 중간에 대리자를 두는 패턴