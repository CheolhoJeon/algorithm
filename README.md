# Algorithm Quiz
[![npm](https://img.shields.io/badge/version-2020.04-brightgreen.svg)]()

## What is the project
이 프로젝트는 Cheolho Jeon가 제작한 Algorithm Quiz 저장소입니다.

## Contents



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

<img src="https://user-images.githubusercontent.com/42791260/72779139-60fce400-3c5e-11ea-8045-d71b8a624f71.png" width="80%">


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
