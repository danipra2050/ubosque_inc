import { BrowserRouter, Routes, Route } from 'react-router-dom';
import Header from './components/Header.js';
import UploadFile from './uploadFile/UploadFile.js';

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Header/>}/>
        <Route path="/file" element={<UploadFile/>}/>
      </Routes>
    </BrowserRouter>
  );
}

export default App;