import logo from './logo.svg';
import './App.css';

function App() {  // 메인
  return (
    <div
        style={{  textAlign:"center" /* 가운데 정렬 */ }}
    >
      <h1>간단한 계산기</h1>
      {/* 첫 번째 숫자를 입력하는 칸 */}
      <div>
        <label>
          첫 번째 숫자: {" "} 
          <input
            type="number" // 숫자만 입력 가능
            placeholder="숫자를 입력하세요" // 사용자에게 보여줄 화면
          />
        </label>
      </div>
      {/* 두 번째 숫자를 입력하는 칸*/}
      <div>
        <label>
          두 번째 숫자: {" "}
          <input
            type="number" // 숫자만 입력 가능
            placeholder="숫자를 입력하세요" // 사용자에게 보여줄 화면
          />
        </label>
      </div>

      {/* 연산 버튼들 */}
      <div>
        {/* 더하기 버튼 */}
        <button> 더하기 </button>

        {/* 빼기 버튼 */}
        <button> 빼기 </button>

        {/* 곱하기 버튼 */}
        <button> 곱하기 </button>

        {/* 나누기 버튼 */}
        <button> 나누기 </button>
      </div>

      {/* 결과를 보여주는 부분 */}
      <div>
        <h2>결과: </h2>
      </div>
    </div>
  );
}

export default App;
