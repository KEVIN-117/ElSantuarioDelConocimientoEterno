import React, { useState } from 'react';
import { keyframes } from '@emotion/react';
import styled from '@emotion/styled';

// Componente de neón animado
const NeonText = styled.h1`
  font-size: 1.5rem;
  font-weight: bold;
  color: #fff;
`;

const NeonButton = styled.button`
  font-size: 1.5rem;
  font-weight: bold;
  color: #e60073;
  background-color: #1a1a1a;
  border: none;
  padding: 10px 20px;
  border-radius: 10px;
  cursor: pointer;
  transition: all 0.2s ease-in-out;

  &:hover {
    background-
    color: #e60073;
    color: #1a1a1a;
  }
`;

const NeonThemeComponent = (props: any) => {
    const [isNeonOn, setNeonOn] = useState(false);

    const toggleNeon = () => {
        setNeonOn(!isNeonOn);
    };

    return (
        <div className="bg-gray-900 text-white p-6 rounded-lg shadow-lg ml-5">
            <NeonText className={isNeonOn ? 'neon-text' : ''}>{props.title}</NeonText>
            <p className="text-lg pl-5 text-justify">{props.description}</p>
        </div>
    );
};

export default NeonThemeComponent;
