## Git 명령어 메모

### config
+ git config --global <옵션명>
지정한 전역 옵션의 내용을 살펴봅니다.
+ git config --global <옵션명> <새로운값>
지정한 전역 옵션의 값을 새로 설정합니다.
+ git config --global --unset <옵션명>
지정한 전역 옵션의 내용을 삭제합니다.
+ git config --local <옵션명> //지역
+ git config --local <옵션명> <새로운값>
+ git config --local --unset <옵션명>
+ git config --system <옵션명> //시스템
+ git config --system <옵션명> <새로운값>
+ git config --system --unset <옵션명>
+ git config --list
현재 프로젝트의 모든 옵션을 살펴봅니다.
+ ex) git config --global user.name or user.email
지역>전역>시스템 의 우선순의를 가지고 일반적인 개인PC에서는 전역을 많이쓴다


p227

### commit 
- commit -m [메세지]
- amend 



체리픽 틀정지점 변경하기

1
2
3
4
5
