import styled from 'styled-components';
import Ultimoslancamentos from '../componentes/UltimosLancamentos';
import Pesquisa from '../componentes/Pesquisa';

const AppContainer = styled.div`
  width: 100vw;
  height: 100vh;
  background-image: linear-gradient(90deg, #002F52 35%, #326589);
`

function Home() {
  return (
    <AppContainer>
      <Pesquisa />
      <Ultimoslancamentos />
    </AppContainer>
  );
}

export default Home;