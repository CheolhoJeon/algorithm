# Algorithm Quiz
[![npm](https://img.shields.io/badge/version-2018.36-brightgreen.svg)]()

## What is the project
이 프로젝트는 Cheolho Jeon가 제작한 Algorithm Quiz 저장소입니다.

## Contents

<details>
<summary>Q001. 1~n까지의 합</summary><br/>

한 정수 n을 입력 받아서 '1~n'까지의 합을 구하여 출력하시오. (수행 시간 출력)<br/>
단, 입력 방법은 구현하지 않아도 되며, 입력 값을 변수를 선언하여 사용해도 됩니다.<br/>
<br/>
1. Recursion<br/>
2. Repetition<br/>
<br/>
입력: 정수 n(2 ≤ n ≤ 10,000)이 첫 번째 줄에 입력됩니다.<br/>
출력: 1 ~ n까지의 합을 정수로 출력하시오.<br/>
<br/>
입력: 10<br/>
결과(Recursion): 55<br/>
결과(Repetition): 55<br/>
<br/>
</details>

<details>
<summary>Q002. 부분집합의 합</summary>
<h3>문제</h3>
N개의 정수로 이루어진 집합이 있을때, 이 집합의 공집합이 아닌 부분집합 중에서 그 집합의 원소를 다 더한 값이 S가 되는 경우의 수를 구하는 프로그램을 작성하시오.

<h3>입력</h3>
첫째 줄에 정수의 개수를 나타내는 N과 정수 S가 주어진다(1<=N<=20, |S|<=1,000,000). 둘째 줄에 N개의 정수가 빈 칸을 사이에 두고 주어진다. 주어지는 정수의 절대값은 100,000을 넘지 않는다. 같은 수가 여러번 주어질 수도 있다.

<h3>출력</h3>
첫째 줄에 합이 S가 되는 부분집합의 개수를 출력한다.

<h3>Example</h3>
<img src=https://user-images.githubusercontent.com/42791260/46407323-8902c400-c749-11e8-8c1d-5160063b989d.png>
</details>

<details>
<summary>Q003. 가운데 글자 가져오기</summary>
<h3>문제</h3>
단어 s의 가운데 글자를 반환하는 함수, solution을 만들어 보세요. 단어의 길이가 짝수라면 가운데 두글자를 반환하면 됩니다.

<h3>제한사항</h3>
s는 길이가 1 이상, 100이하인 스트링입니다.

<h3>입출력 예</h3>
<img src=https://user-images.githubusercontent.com/42791260/49803807-37536700-fd94-11e8-9b53-8399cc75e1d9.png width="20%">
</details>

<details>
<summary>Q004. 같은 숫자는 싫어</summary>
<h3>문제 설명</h3>
배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다.<br/>
이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다.<br/>
배열 arr에서 제거 되고 남은 수들을 return 하는 solution 함수를 완성해 주세요.<br/>
단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다.<br/>
예를들면<br/>
arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.<br/>
arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.<br/>
배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.<br/>

<h3>제한사항</h3>
배열 arr의 크기 : 1,000,000 이하의 자연수
배열 arr의 원소의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수

<h3>입출력 예</h3>
<img src=https://user-images.githubusercontent.com/42791260/49941349-91cffd00-ff25-11e8-9df4-d92ac3fa12ee.png width="20%">
</details>

## Building
Clone a copy of the repository:
```bash
$ git clone git@git.wisoft.io:cheolho/algorithm-quiz.git
```

Change to the project directory:
```bash
$ cd algorithm-quiz
```

## Contributors
* Cheolho Jeon [(woung2770@gmail.com)](woung2770@gmail.com)