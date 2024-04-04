# PANDAS
- `pandas` es una biblioteca de python para, se utiliza para trabajar con grandes cantidades de datos
- Tiene funciones para analizar, limpiar, explorar y manipular datos

## porque utilizar pandas
Pandas nos permite analizar datos y sacar conclusiones basados en teorías estadísticas, Aquí hay varias razones por las cuales deberías considerar utilizar Pandas en tus proyectos de análisis de datos:

1. **Structura de datos flexibles**: dos estructuras de datos principales dataframes y series que son `flexibles` y `poderosas`, un dataframe se parece a una tabla de base de datos u hojas de cálculo, mientras una serie es una estructura de dato unidimensional similar a una matriz o lista.
2. **Manipulación de datos**: pandas ofrece una amplia gama de funciones y métodos que nos permiten poder fusionar, ordenar, filtrar, agregar, seleccionar y pivotar datos estas funciones son muy importantes para poder preparar los datos antes de analizarlos.
3. **Manejo de datos faltantes**: pandas puede eliminar columnas o filas, rellenarlos con valores predeterminados, o aplicar estrategias mas avanzadas de imputación a datos faltantes `"null"`.
4. **Operaciones de Grupo y Agregación**: pandas tiene integrado el método `"groupby()"` esto permite analizar datos por categorías o grupos.
5. **Lectura y Escritura de Datos**: pandas permite la escritura y lectura de datos en los archivos con los formatos CSV, Excel, SQL, JSON, HDF5.
## Crear, leer y escribir

### Creando datos
Como ya se mencionó hay 2 estructuras principales que maneja pandas 

- para comenzar con pandas primero se debe importar la biblioteca
```doctest
# importar pandas
import pandas as pd
```
- DataFrames: un data frame esta constituido por columnas y filas de datos, para crear una dataFrame es tan simple como sigue:
```doctest
# crear un data frame
df = pd.DataFrame({'Yes': [50, 21], 'No': [131, 2]})
print(df)
```

- Series: una serie es una secuencia de datos lineal (lista), se crea de la siguiente manera
```doctest
df = pd.Series([1, 2, 3, 4, 5])
print(df)
```

### Lectura de archivos de datos
Es utili poder crear manualmente los dataFrames, pero no siempre lo estaremos creando ya trabajaremos con datos que ya existen, pero estarán dentro de archivos y para trabajar con esos datos se ve la necesidad de leer archivos, pandas tiene integradas funciones de lectura.

Pandas proporciona varias funciones para leer archivos de diferentes formatos en un DataFrame. Aquí tienes algunas de las funciones más comunes para leer archivos con Pandas:

1. **CSV (Comma-Separated Values):**

    ```doctest
    import pandas as pd
    df = pd.read_csv('archivo.csv')
    ```
    
    - adicional a esto para poder ver que tan grande es nuestro dataframe podemos utilizar el atributo de forma `(shape)`
    ```doctest
    df = pd.read_csv('archivo.csv')
    print(df.shape)
    # como salida se obtiene (filas, columnas)
    ```
   Puedes especificar opciones adicionales, como el separador (por defecto es la coma), el encabezado, el índice, etc., utilizando argumentos de la función `read_csv()`.

2. **Excel:**

   ```doctest
   import pandas as pd
   df = pd.read_excel('archivo.xlsx', sheet_name='hoja1')
   ```

   Puedes especificar el nombre de la hoja utilizando el argumento `sheet_name`.

3. **JSON (JavaScript Object Notation):**

   ```doctest
   import pandas as pd
   df = pd.read_json('archivo.json')
   ```

4. **SQL (Structured Query Language):**

   Pandas puede leer datos directamente desde bases de datos SQL utilizando la función `read_sql()`. Debes proporcionar una conexión a la base de datos y una consulta SQL.

   ```doctest
   import pandas as pd
   from sqlalchemy import create_engine

   engine = create_engine('sqlite:///mi_base_de_datos.db')
   consulta_sql = 'SELECT * FROM mi_tabla'
   df = pd.read_sql(consulta_sql, con=engine)
   ```

5. **HDF5 (Hierarchical Data Format version 5):**

   ```doctest
   import pandas as pd
   df = pd.read_hdf('archivo.h5', key='mi_dataset')
   ```

   Los archivos HDF5 pueden contener varios conjuntos de datos (datasets), por lo que debes especificar el nombre del dataset que deseas leer utilizando el argumento `key`.

6. **Parquet:**

   ```doctest
   import pandas as pd
   df = pd.read_parquet('archivo.parquet')
   ```

   Parquet es un formato de almacenamiento de datos eficiente para datos tabulares.

7. **HTML (Web scraping):**

   Pandas puede extraer tablas de una página web y convertirlas en un DataFrame.

   ```doctest
   import pandas as pd
   lista_de_dataframes = pd.read_html('https://ejemplo.com/mi_pagina.html')
   df = lista_de_dataframes[0]  # Selecciona el DataFrame deseado de la lista
   ```
[Creating, Reading and Writing](https://www.kaggle.com/embed/residentmario/creating-reading-and-writing?cellIds=22&kernelSessionId=126670728)


## Exploración de Datos
La exploración de datos es una parte fundamental del análisis de datos y Pandas ofrece diversas herramientas y funciones para realizar esta tarea de manera efectiva. Aquí te muestro cómo puedes explorar tus datos utilizando Pandas:

1. **Visualización de las primeras filas del DataFrame:**
   
   Puedes utilizar el método `head()` para mostrar las primeras filas de tu DataFrame. Esto te dará una vista previa de los datos y las columnas.

   ```doctest
   import pandas as pd

   # Cargar un DataFrame de ejemplo
   data = {'Nombre': ['Alice', 'Bob', 'Charlie'],
           'Edad': [25, 30, 35]}
   df = pd.DataFrame(data)

   # Mostrar las primeras 5 filas
   print(df.head())
   ```

2. **Información general del DataFrame:**

   Utiliza el método `info()` para obtener información sobre el DataFrame, incluyendo los tipos de datos de las columnas y la cantidad de valores no nulos.

   ```doctest
   print(df.info())
   ```

3. **Resumen estadístico básico:**

   Utiliza el método `describe()` para obtener estadísticas descriptivas de las columnas numéricas, como la media, la desviación estándar y los percentiles.

   ```doctest
   print(df.describe())
   ```

4. **Conteo de valores únicos:**

   Puedes usar el método `value_counts()` para contar los valores únicos en una columna específica. Esto es útil para resumir datos categóricos.

   ```doctest
   print(df['Nombre'].value_counts())
   ```

5. **Selección de columnas específicas:**

   Puedes seleccionar columnas específicas de tu DataFrame para explorar sus valores con más detalle.

   ```doctest
   print(df['Edad'])
   ```

6. **Filtrado de datos:**

   Utiliza la capacidad de Pandas para filtrar datos según condiciones específicas. Por ejemplo, puedes filtrar filas donde la edad sea mayor que 30.
   
   - muestra un subconjunto del DataFrame original que cumple con la condición
   ```doctest
   print(df[df['Edad'] > 30])
   ```
   - muestra una Serie booleana que representa la condición
   ```doctest
   print(df['Edad'] > 30)
   ```

7. **Agrupación y resumen de datos:**

   Utiliza el método `groupby()` para agrupar tus datos por categorías y luego aplica funciones de agregación como `mean()`, `sum()`, o `count()` para obtener resúmenes por grupo.

   ```doctest
   print(df.groupby('Nombre')['Edad'].mean())
   ```

8. **Manejo de valores faltantes:**

   Utiliza métodos como `isna()` o `isnull()` para identificar valores faltantes y funciones como `fillna()` o `dropna()` para tratarlos.

   ```doctest
   print(df.isna().sum())
   ```
Estos son algunos ejemplos de cómo puedes explorar datos utilizando Pandas. La exploración de datos es una fase crucial en la preparación y el análisis de datos, y Pandas proporciona una variedad de herramientas para ayudarte a comprender mejor tus datos antes de realizar análisis más avanzados.


## Indexación, selección y asignación

### Indexación en pandas
La indexación, selección y asignación de datos en Pandas son operaciones esenciales para trabajar con DataFrames y Series. Estas operaciones te permiten acceder a datos específicos en tus estructuras de datos y modificarlos según sea necesario. Aquí te explicaré cómo realizar estas operaciones en Pandas:

### Indexación y Selección:

1. **Selección basada en etiquetas (Columnas):**

   Puedes seleccionar una columna específica de un DataFrame utilizando la notación de corchetes `[]` o el operador de punto `.` seguido del nombre de la columna. Aquí tienes ejemplos:

   ```doctest
   import pandas as pd

   data = {'Nombre': ['Alice', 'Bob', 'Charlie'],
           'Edad': [25, 30, 35]}
   df = pd.DataFrame(data)

   # Usando corchetes
   columna_nombre = df['Nombre']

   # Usando el operador de punto
   columna_edad = df.Edad
   ```

2. **Selección basada en Índice:**

      - con la directiva `iloc` nos permite la selección basada en índices 
      - se utiliza para seleccionar datos utilizando índices enteros de filas y columnas
      - La sintaxis general es `df.iloc[filas, columnas]`, donde filas y columnas son listas o rangos de índices enteros.
      - `iloc` incluye el primer elemento del rango y excluye el ultimo
      ```doctest
      import pandas as pd
      data = {'A': [1, 2, 3],
              'B': [4, 5, 6],
              'C': [7, 8, 9]}
      df = pd.DataFrame(data)
      
      # Seleccionar una celda por índices enteros
      valor = df.iloc[0, 0]
      
      # Seleccionar un rango de filas y columnas por índices enteros
      subset = df.iloc[1:3, 1:3]
   ```
   -
   ```doctest
   df = reviews.iloc[0:100, [reviews.columns.get_loc('country'), reviews.columns.get_loc('variety')]]
   ```
3. **Selección de Filas por Condiciones:**

   Puedes filtrar filas que cumplan con una condición utilizando una expresión booleana dentro de los corchetes `[]`. Aquí tienes un ejemplo:

   ```doctest
   # Filtrar filas donde la edad sea mayor que 30
   filas_mayor_30 = df[df['Edad'] > 30]
   ```

### Asignación de Datos:

1. **Asignación de Valores a Columnas Existentes:**

   Puedes asignar valores a una columna existente en un DataFrame de la siguiente manera:

   ```doctest
   # Asignar una nueva lista de edades a la columna 'Edad'
   df['Edad'] = [26, 31, 36]
   ```

2. **Creación de Nuevas Columnas:**

   Puedes crear una nueva columna y asignar valores a ella de la siguiente manera:

   ```doctest
   # Crear una nueva columna 'Ciudad' y asignar valores
   df['Ciudad'] = ['Nueva York', 'Los Ángeles', 'Chicago']
   ```

3. **Asignación de Valores a Celdas Específicas:**

   Puedes asignar un valor a una celda específica en el DataFrame utilizando `.loc[]`. Por ejemplo:

   ```doctest
   # Asignar un nuevo nombre a la primera fila
   df.loc[0, 'Nombre'] = 'Alicia'
   ```

4. **Asignación de Valores en Filas Filtradas:**

   También puedes asignar valores a celdas en un conjunto de filas filtradas. Por ejemplo:

   ```doctest
   # Asignar una nueva edad a todas las personas con nombre 'Bob'
   df.loc[df['Nombre'] == 'Bob', 'Edad'] = 32
   ```

Estos son algunos ejemplos básicos de cómo realizar operaciones de indexación, selección y asignación en Pandas. Las posibilidades son mucho más amplias y dependen de tus necesidades específicas de análisis de datos.

### Operaciones Básicas:

Las operaciones básicas en Pandas se refieren a las tareas fundamentales que puedes realizar para manipular y trabajar con los datos en un DataFrame. Aquí tienes una descripción de algunas de las operaciones básicas en Pandas:
1. **Operaciones Matemáticas:**
   - Pandas permite realizar operaciones matemáticas en columnas. Puedes aplicar operaciones como suma, resta, multiplicación y división directamente a las columnas. Por ejemplo:
     ```doctest
     df['nueva_columna'] = df['columna1'] + df['columna2']
     ```

2. **Manejo de Valores Nulos:**
   - Puedes utilizar funciones como `fillna()` para llenar valores nulos con un valor específico y `dropna()` para eliminar filas o columnas con valores nulos. Por ejemplo:
     ```doctest
     df.fillna(0, inplace=True)  # Rellenar valores nulos con 0, en lugar de 0 puede ir con lo que quiere rellenar todos los nulos
     df.dropna(subset=['columna'], inplace=True)  # Eliminar filas con valores nulos en una columna específica
     ```

3. **Ordenamiento de Datos:**
   - Puedes ordenar un DataFrame en función de los valores de una o más columnas utilizando la función `sort_values()`. Por ejemplo:
     ```doctest
     df_ordenado = df.sort_values(by='columna', ascending=False)
     ```

4. **Cálculo de Estadísticas Resumidas:**
   - Utiliza `describe()` para obtener estadísticas resumidas de las columnas numéricas en un DataFrame, como media, desviación estándar, mínimo y máximo.

5. **Agregar Nuevas Filas y Columnas:**
   - Puedes agregar nuevas filas y columnas a un DataFrame de manera sencilla. Por ejemplo:
     ```doctest
     df['nueva_columna'] = nueva_serie
     nueva_fila = {'columna1': valor1, 'columna2': valor2}
     df = df.append(nueva_fila, ignore_index=True)
     ```

6. **Eliminar Columnas:**
   - Para eliminar una columna de un DataFrame, puedes usar la palabra clave `del` o la función `drop()`. Por ejemplo:
     ```doctest
     del df['columna_a_eliminar']
     df.drop(columns=['columna_a_eliminar'], inplace=True)
     ```
   - `implace` este parametro qeu se utiliza en ciertas funciones de pandas, si es `True` significa que la operacion se realizara en el dataFrame original, pero si es falso este retornará un nuevo DataFrame.

Estas son algunas de las operaciones básicas en Pandas que te ayudarán a realizar tareas esenciales de manipulación y limpieza de datos en tu análisis. A medida que te familiarices con estas operaciones, podrás realizar análisis de datos más complejos y avanzados.


## Nivel 2

### Agrupar y ordenar

   1. **Agrupación de Datos (`groupby()`):** La agrupación de datos es una operación fundamental en Pandas que te permite dividir un DataFrame en grupos basados en una o más columnas. Esto se hace utilizando el método `groupby()`. Cuando agrupas datos, estás creando subconjuntos de datos basados en valores comunes en una o más columnas. Esto es útil cuando deseas realizar cálculos específicos dentro de cada grupo.
      como parametro al método  `groupby()` se le puede pasar solo una columna o una lista de columnas 
      Ejemplo:
      ```doctest
      # Agrupar datos por la columna 'categoria'
      grupos = df.groupby('<columnas del DataFrama>')
      ```
   
   2. **Funciones de Agregación:** Una vez que has agrupado los datos, generalmente deseas realizar operaciones de agregación en cada grupo. Las funciones de agregación son aquellas que toman un conjunto de valores y devuelven un solo valor que resume esos datos. Algunas funciones de agregación comunes incluyen `sum()`, `mean()`, `median()`, `min()`, `max()`, `count()`, entre otras.
   Ejemplo:
      ```doctest
      # Calcular la suma de los valores en cada grupo
      suma_por_grupo = grupos['valor'].sum()
      ```
   3. **Tablas Pivote (`pivot_table()`):** A veces, necesitas crear una tabla que resuma los datos de una manera específica, donde las filas y columnas representen ciertas categorías o variables. Para hacerlo, puedes utilizar `pivot_table()`. Esta función te permite crear tablas pivote basadas en tus datos y realizar cálculos específicos en las intersecciones de filas y columnas.

      Ejemplo:
      ```doctest
      # Crear una tabla pivote para resumir datos
      tabla_pivote = pd.pivot_table(df, values='valor', index='categoria', columns='fecha', aggfunc='sum')
      ```

   4. **Múltiples Columnas de Agrupación:** Puedes agrupar datos en función de múltiples columnas, lo que te permite realizar análisis más detallados. Por ejemplo, podrías agrupar datos por categoría y año simultáneamente.

      Ejemplo:
      ```doctest
      # Agrupar datos por 'categoria' y 'año'
      grupos = df.groupby(['categoria', 'año'])
      ```

   5. **Personalización de las Funciones de Agregación:** Puedes personalizar las funciones de agregación para realizar cálculos específicos en tus grupos. Por ejemplo, podrías definir una función personalizada y utilizarla con `agg()` para realizar cálculos más complejos.

      Ejemplo:
      ```doctest
      # Definir una función personalizada
      def operation(x):
          return x.max() - x.min()

      # Aplicar la función personalizada a cada grupo
      resultado = grupos['valor'].agg(operation)
      ```

   6. **Filtrado de Grupos:** Puedes filtrar grupos basados en condiciones específicas utilizando `filter()`. Esto te permite seleccionar solo aquellos grupos que cumplan con ciertos criterios.

      Ejemplo:
      ```doctest
      # Filtrar grupos donde la suma de 'valor' sea mayor que 100
      grupos_filtrados = grupos.filter(lambda x: x['valor'].sum() > 100)
      ```

   Estos conceptos te permitirán realizar análisis más avanzados y obtener información valiosa de tus datos al agruparlos y resumirlos de manera efectiva utilizando Pandas.

## Nivel 4

### Resumen de funciones y mapas

1. **Resumen de funciones**
      - **describe()**: El método `describe()` en Pandas se utiliza para generar estadísticas descriptivas resumidas de un DataFrame. Proporciona información clave sobre las columnas numéricas en el DataFrame, incluyendo estadísticas como la media, la desviación estándar, el valor mínimo, el percentil 25, la mediana (percentil 50), el percentil 75 y el valor máximo. Estas estadísticas ayudan a comprender la distribución y la tendencia central de los datos.
   
      Aquí está cómo usar el método `describe()` en Pandas:
      
      ```doctest
      import pandas as pd
      
      # Supongamos que tienes un DataFrame llamado 'df'
      des = df.describe()
      ```
      
      La variable `descripcion_estadistica` contendrá un nuevo DataFrame que muestra las estadísticas descriptivas para todas las columnas numéricas de `df`.
      
      Las estadísticas generadas por `describe()` son las siguientes:
      
      - **count:** El número de valores no nulos en la columna.
      - **mean:** La media aritmética de la columna.
      - **std:** La desviación estándar de la columna.
      - **min:** El valor mínimo de la columna.
      - **25%:** El valor que representa el percentil 25 de la columna.
      - **50%:** El valor que representa la mediana o percentil 50 de la columna.
      - **75%:** El valor que representa el percentil 75 de la columna.
      - **max:** El valor máximo de la columna .
      
      Estas estadísticas son útiles para obtener una visión general de la distribución de los datos
      
      Es importante mencionar que `describe()` solo calcula estadísticas para columnas numéricas. Las columnas con datos no numéricos (como cadenas de texto) se excluyen automáticamente de las estadísticas generadas por este método. Si deseas obtener estadísticas para todas las columnas, incluyendo las no numéricas, puedes especificar `include='all'` como argumento:
      
      ```doctest
      des = df.describe(include='all')
      ```
      En este caso, el resultado incluirá estadísticas tanto para columnas numéricas como no numéricas.

   - Para ver una lista de valores únicos podemos usar la función `unique()`
   - Para ver una lista de valores únicos y con qué frecuencia ocurren en el conjunto de datos, podemos usar el método `value_counts()`
2. **Maps**: En el contexto de pandas un `"map"` se refiere a la aplicación de una función o un mapeo de valores a una columna o Serie de un DataFrame, el objetivo de usar map es poder transformar datos existentes de una columna a nuevos datos basados en algún criterio o función personalizada 
- `map()`