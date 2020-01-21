# Algorithm Quiz
[![npm](https://img.shields.io/badge/version-2020.04-brightgreen.svg)]()

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

<details>
<summary>Q005. 나누어 떨어지는 숫자 배열</summary>
<h3>문제 설명</h3>
array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 정렬한 배열을 반환하는 함수, solution을 작성해주세요.<br/>
divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.<br/>

<h3>제한사항</h3>
arr은 자연수를 담은 배열입니다.<br/>
정수 i, j에 대해 i ≠ j 이면 arr[i] ≠ arr[j] 입니다.<br/>
divisor는 자연수입니다.<br/>
array는 길이 1 이상인 배열입니다.<br/>

<h3>입출력 예</h3>
<img src=https://user-images.githubusercontent.com/42791260/49986930-f1c1b480-ffb4-11e8-9b9a-b9e614709143.png width="20%">

<h3>입출력 예 설명</h3>
입출력 예#1<br/>
arr의 원소 중 5로 나누어 떨어지는 원소는 5와 10입니다. 따라서 [5, 10]을 리턴합니다.<br/>
<br/>
입출력 예#2<br/>
arr의 모든 원소는 1으로 나누어 떨어집니다. 원소를 오름차순으로 정렬해 [1, 2, 3, 36]을 리턴합니다.<br/>
<br/>
입출력 예#3<br/>
3, 2, 6은 10으로 나누어 떨어지지 않습니다. 나누어 떨어지는 원소가 없으므로 [-1]을 리턴합니다.<br/>
</details>

<details>
<summary>Q006. 124 나라의 숫자</summary>
<h3>문제 설명</h3>
124 나라가 있습니다. 124 나라에서는 10진법이 아닌 다음과 같은 자신들만의 규칙으로 수를 표현합니다.<br/>
<br/>
1. 124 나라에는 자연수만 존재합니다.<br/>
2. 124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.<br/>
<br/>
예를 들어서 124 나라에서 사용하는 숫자는 다음과 같이 변환됩니다.<br/>
<br/>
<img src=https://user-images.githubusercontent.com/42791260/50152004-c832c100-0305-11e9-9c8e-0892aea2a973.png width="25%">
<br/>
자연수 n이 매개변수로 주어질 때, n을 124 나라에서 사용하는 숫자로 바꾼 값을 return 하도록 solution 함수를 완성해 주세요.

<h3>제한사항</h3>
n은 500,000,000이하의 자연수 입니다.<br/>

<h3>입출력 예</h3>
<img src=https://user-images.githubusercontent.com/42791260/50152105-1647c480-0306-11e9-9efb-22f9c6de76bf.png width="10%">
</details>

<details>
<summary>Q007. 모의고사</summary>
<h3>문제 설명</h3>
수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.<br/>
<br/>
1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...<br/>
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...<br/>
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...<br/>
<br/>
1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.<br/>

<h3>제한사항</h3>
1.시험은 최대 10,000 문제로 구성되어있습니다.<br/>
2.문제의 정답은 1, 2, 3, 4, 5중 하나입니다.<br/>
3.가장 높은 점수를 받은 사람이 여럿일 경우, return하는 값을 오름차순 정렬해주세요.<br/>

<h3>입출력 예</h3>
<img src=https://user-images.githubusercontent.com/42791260/51067476-0e094d80-1656-11e9-86c1-7c665b9eb676.png width="10%">

</details>

<details>
<summary>Q008. 소수찾기</summary>
<h3>문제 설명</h3>
1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요.<br/>
<br/>
소수는 1과 자기 자신으로만 나누어지는 수를 의미합니다.<br/>
(1은 소수가 아닙니다.)<br/>
<h3>제한사항</h3>
n은 2이상 1000000이하의 자연수입니다.<br/>

<h3>입출력 예</h3>
<img src=https://user-images.githubusercontent.com/42791260/51602608-c71b3200-1f4a-11e9-8cd0-9ac7fee5cc3c.png width="10%">

</details>

<details>
<summary>Q009. 수박수박수박수박수박수?</summary>
<h3>문제 설명</h3>
길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.<br/>
예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.<br/>
<br/>
<h3>제한사항</h3>
n은 길이 10,000이하인 자연수입니다.<br/>

<h3>입출력 예</h3>
<img src=https://user-images.githubusercontent.com/42791260/51607988-9098e380-1f59-11e9-82fc-48203e313b66.png width="10%">

</details>
<details>
<summary>Q010. 시저 암호</summary>
<h3>문제 설명</h3>
어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다.<br/>
예를 들어 AB는 1만큼 밀면 BC가 되고, 3만큼 밀면 DE가 됩니다. z는 1만큼 밀면 a가 됩니다.<br/>
문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.<br/>
<br/>
<h3>제한사항</h3>

- 공백은 아무리 밀어도 공백입니다.
- s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
- s의 길이는 8000이하입니다.
- n은 1 이상, 25이하인 자연수입니다.

<br/>
<h3>입출력 예</h3>

<img src=https://user-images.githubusercontent.com/42791260/62760895-22180f00-bac0-11e9-8eea-6923dd877e35.png width="20%">

</details>
<details>
<summary>Q011. 제일 작은수 제거하기</summary>
<h3>문제 설명</h3>
정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면 [-1]을 리턴 합니다.
<br/>
<h3>제한사항</h3>

- arr은 길이 1 이상인 배열입니다.
- 인덱스 i, j에 대해 i ≠ j이면 arr[i] ≠ arr[j] 입니다.

<br/>
<h3>입출력 예</h3>

<img src=https://user-images.githubusercontent.com/42791260/69258425-e7b22800-0bff-11ea-978b-9200d706b430.png width="20%">

</details>
<details>
<summary>Q012. 자릿수 더하기</summary>
<h3>문제 설명</h3>
자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
<br/>
<h3>제한사항</h3>

- N의 범위 : 100,000,000 이하의 자연수

<br/>
<h3>입출력 예</h3>

<img src=https://user-images.githubusercontent.com/42791260/69262068-20ed9680-0c06-11ea-98e2-95581af31eab.png width="20%">

</details>
<details>
<summary>Q013. K번째 수</summary>
<h3>문제 설명</h3>
배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.<br/>
예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면<br/>
array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.<br/>
1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.<br/>
2에서 나온 배열의 3번째 숫자는 5입니다.<br/>
배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, <br/>
commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.<br/>
<br/>
<h3>제한사항</h3>

- array의 길이는 1 이상 100 이하입니다.
- array의 각 원소는 1 이상 100 이하입니다.
- commands의 길이는 1 이상 50 이하입니다.
- commands의 각 원소는 길이가 3입니다.

<br/>
<h3>입출력 예</h3>

<img src="" width="20%">


<h3>입출력 예 설명</h3>
[1, 5, 2, 6, 3, 7, 4]를 2번째부터 5번째까지 자른 후 정렬합니다. [2, 3, 5, 6]의 세 번째 숫자는 5입니다.<br/>
[1, 5, 2, 6, 3, 7, 4]를 4번째부터 4번째까지 자른 후 정렬합니다. [6]의 첫 번째 숫자는 6입니다.<br/>
[1, 5, 2, 6, 3, 7, 4]를 1번째부터 7번째까지 자릅니다. [1, 2, 3, 4, 5, 6, 7]의 세 번째 숫자는 3입니다.<br/>

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
