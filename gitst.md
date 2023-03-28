## Git 명령어 메모

### config
* git config --global <옵션명> : 지정한 전역 옵션의 내용을 살펴봅니다.
* git config --global <옵션명> <새로운값> : 지정한 전역 옵션의 값을 새로 설정합니다.
* git config --global --unset <옵션명> : 지정한 전역 옵션의 내용을 삭제합니다.
* git config --local <옵션명> //지역
* git config --local <옵션명> <새로운값>
* git config --local --unset <옵션명>
* git config --system <옵션명> //시스템
* git config --system <옵션명> <새로운값>
* git config --system --unset <옵션명>
* git config --list

```aidl
현재 프로젝트의 모든 옵션을 살펴봅니다.
+ ex) git config --global user.name or user.email
지역>전역>시스템 의 우선순의를 가지고 일반적인 개인PC에서는 전역을 많이쓴다
```

### commit 
* commit -m [메세지]
* amend    //이전 커밋돌리기 옵션

### push
* git remote add <원격저장소 이름> <원격저장소 주소>    //원격저장소를 등록합니다.
  + ex) git remote add origin https://~~~~
* git remote -v //언격저장소 목록을 살펴봅니다.
* git push
  + upstream 에러발생시대처
  + git push --set-upstream origin master
  + git push -u origin master //-u 약어이다


### clone
* git clone <저장소주소> [새로운 폴더명]
```aidl
저장주소만 입력할경우 기존폴더가 있울경우 오류가 발생할수 있
```

### branch
* git branch [-v] : 로컬저장소의 브랜치 목록
* git branch [-f] <브랜치이름> [커밋체크섬] : 새로운 브랜치를 생성 체크섬이 없으면 HEAD 기준으로 생성한다. 이미다른 브랜치가 있을 경우 -f 옵션을 추가한다.
* git branch -r[v] : 원격저장소에 있는 브랜치 목록
* git checkout <브래치이름> : 브랜치 체크아웃
* git checkout -b <브랜치이름> <커밋 체크섬> : 특정 커밋에서 브랜치를 생성하고 동시에 체크아웃함
* git merge <대상 브랜치> : 현재브랜치와 대상브랜치를 병합한다
* git rebase <대상 브랜치> : 내 브랜치의 커밋을 대상브랜치에 재배치
* git branch -d : 특정 브랜치 삭제
* git branch -D : 특정 브랜치 강제삭제


학습 256P


code:

    dfkdfkl
end

* * *

``` java
public void aaa() {

}
```



체리픽 틀정지점 변경하기
https://learngitbranching.js.org/

