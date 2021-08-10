# Android_studio

✅ **Anroid studio**란 ?

![image](https://user-images.githubusercontent.com/66320010/128838634-539cc676-cc91-45e9-8d07-48c136b7c1ef.png)

- Android 앱 개발을 위한 공식 통합 개발 환경(IDE)

- IntelliJ IDEA 기반(pycharm과 동일)

- 장점 : 유연한 gradle 기반 빌드 시스템 / 에뮬레이터 / 모든 안드로이드 기기 지원 / C++ 및 NDK 지원 / 빠른 빌드

✅ Android build 과정

![image](https://user-images.githubusercontent.com/66320010/128839263-d55f8e8c-6124-4ec1-b164-561106d38bdf.png)

✅ Android studio 다운로드

https://developer.android.com/studio?gclid=CjwKCAiA9bmABhBbEiwASb35V3tPg0Tce1ZH7Q0QovJosMuivfdHRxBrphqqnZFFfcPd-T48OSyeaBoCRBAQAvD_BwE&gclsrc=aw.ds

✅ Android device를 연결 

![image](https://user-images.githubusercontent.com/66320010/128839842-c0361eda-ffe4-4491-b84f-0ad197fe4961.png)

 연결해도 No Devices라면 USB drive 설치

 설치해도 기기 명이 안뜬다면 Device 개발자 모드 설정(Device의 설정 -> 휴대폰 정보 -> 빌드모드(개발자 모드 관련 안내가 나올 때까지 연달아 터치) -> 설정에 개발자 옵션 항목이 있으면 성공)

![image](https://user-images.githubusercontent.com/66320010/128840414-95086605-40e4-4286-aa99-c3fe00643b28.png)

# Android Project

Android studio 프로젝트의 가장 큰 2개의 덩어리는 app 폴더와 Gradle Script 폴더이다.

우선 app 폴더에 대해 집중적으로 알아본다.

app 폴더를 보면 manifests, java, res 폴더로 이루어져 있다.

![image](https://user-images.githubusercontent.com/66320010/128841881-b3428885-fb91-45f0-bc16-900d66d88d35.png)

  - manifest : AndroidManifest.xml 파일을 포함한다. 안드로이드의 컨트롤 타워라고 보면된다. 안드로이드 어플리케이션을 구동하는데 필요한 설정값을 관리해주는 곳이다.
  
  - java : 클래스를 관리하는 폴더이다.
  
  - res : resource 폴더로 UI와 관련된 파일과 디자인 리소스, 문자열 리소스를 담고 있는 폴더이다. 모든 리소스(UI 문자열, 비트맵 이미지, XML 레이아웃 등)를 포함한다. 
  
💡 **안드로이드 어플리케이션 프로젝트 구조는 크게 manifest, java, resource, gradle 로 이루어져 있다.**

1) manifest 폴더 아래 있는 AndroidManifest.xml 파일 ( manifests/AndroidManifest.xml )

![image](https://user-images.githubusercontent.com/66320010/128843386-895a1fa4-afc5-4392-bed5-54bcb9210b04.png)

< >(꺽쇠)로 구분되어있는 코드를 볼 수 있다.

- < manifest > : package= "com.korea.ultra.ultrakorea" ➡ 패키지 표시(폴더구조 표시). com/korea/ultra/ultrakorea 라는 뜻
  
- < application > : icon="@mipmap/ic_launcher" ➡ mipmap폴더 아래에 있는 ic_launcher라는 파일을 앱 아이콘으로 설정한다.
  
   theme="@style/AppTheme" ➡ 어플리케이션에 AppTheme이라는 테마를 적용한다.
     
   label="UltraKorea" ➡ 아이콘에 표시될 어플리케이션 이름은 UltraKorea이다.

 - < activity > < intent-filter > < action > < category > : MainActivity가 생성될 때 자동으로 생성해준다. 

2) java 패키지

    이 패키지내에 java파일(파일명.java)을 만들고 수정한다. 

    어플리케이션이 작동하는 방식에 대해 정의하는 java파일들이 모두 이곳에 들어있다.
  
  ![image](https://user-images.githubusercontent.com/66320010/128854841-15f5e89a-6a2c-440f-b0f7-c8dd91e17f2a.png)
  
  java 패키지 안에 "com.korea.ultra.ultrakorea" 패키지를 보면 MainActivity라는 파일이 들어있다.
  
  ![image](https://user-images.githubusercontent.com/66320010/128854961-071c7a9d-511e-4346-b56c-1b47e016e462.png)
  
   - MainActivity.java는 모든 프로젝트에 필수적으로 있어야하는 기본 파일이다. 
   
   - AndroidManifest.xml에서 < activity > < intent-filter > < action > < category > 에 MainActivity가 등록되어 있는 것을 볼 수 있는데 이 코드로 인해 어플리케이션이 실행될 때 가장 먼저 MainActivity가 실행될 수 있는 것이다.
   
   - 코드를 보면 onCreate()라는 함수가 정의되어 있고 그 안을 보면 setContentView(R.layout.activity_main); 이라는 코드가 보인다. 이 코드는 layout 패키지 아래 있는 activity_main.xml이라는 파일을 View로 연결한다.

  ➡ Activity 파일에서 xml 파일을 연결해준다.
  
  xml 파일은 UI를 구현하는 파일이다. 디자이너로부터 받은 디자인을 구현할 때 xml파일을 만들면 된다.
  
  activity_main.xml에 대해 알아본다.
  
  ![image](https://user-images.githubusercontent.com/66320010/128855666-564a26f5-0923-4363-870b-2d3b73a47d00.png)
  
  AndroidManifest.xml 과 같이 태그형식(<>,꺽쇠)으로 구성된 XML형식의 파일이
  
  Design탭을 누르면 디자인이 어떻게 구현되었는지 미리 보기 기능을 제공한다.
  
 ➡ MainActivity 파일에서 activity_main.xml 파일을 연결해준다.

  activity_main.xml은 res패키지 아래에 layout 패키지 아래에 위치해있다. 레이아웃과 관련한 화면 파일은 모두 이곳에 위치한다.
  
3) res

    res폴더에는 layout, drawable, mipmap, value 패키지가 있다.
  
    layout에 있는 파일들이 디자인의 뼈대를 담당하고 있는 부분이며 나머지는 이미지 파일이나 수치값들을 저장하고 있는 부수적인 저장소이다.
  
  - res/drawble : 이미지 파일 저장 
  
  - res/mipmap : launcher 이미지(앱 아이콘) 저장 ➡ 안드로이드 어플리케이션을 실행할 때 누를 아이콘에 해당한다.
  
  - res/values : 문자열, 색상값, 수치값, 스타일 저장 
  
  - res/values/color.xml : 컬러 값 저장 
  
  - res/values/strings.xml : 문자열 값 저장
  
  - res/values/styles.xml : 스타일 값 저장 

# 정리

1️⃣ 안드로이드 프로젝트는 app과 Gradle Scripts로 이루어져 있다.

2️⃣ app은 manifests, java, res 패키지로 이루어져 있다.

3️⃣ manifests는 프로젝트 설정에 관한 부분, java는 프로그래밍 구현 부분, res는 레이아웃과 이미지, 문자열 리소스 등 UI를 담당하는 부분이다.

4️⃣ 모든 안드로이드 프로젝트는 MainActivity를 기본적으로 가지고 있어야하며 manifests/AndroidManifest.xml에서 설정해준다.

5️⃣ 화면을 만들 때는 Activity(xxx.java파일)과 xml파일(xxx.xml)을 쌍으로 만들어주고 Activity 파일에서 xml파일을 연결해준다.
  
