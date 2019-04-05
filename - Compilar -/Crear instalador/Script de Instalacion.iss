;******************************************************************************************************************************************
; [Setup]: Es la parte en donde se configura la aplicación.
;******************************************************************************************************************************************
[Setup]
AppName=Maria - Comercial Comercial
AppVerName=Maria - Morena Comercial
DefaultGroupName=Maria - Morena Comercial
AppPublisher=Maria - Morena Comercial
AppVersion=1.2
AllowNoIcons=false
AppCopyright=
PrivilegesRequired=admin

; Este es el nombre del archivo exe que se va a generar
OutputBaseFilename=Maria_MorenaComercial_Setup_1.2

; Este es el nombre de la carpeta en la cual se guardarán los archivos para el programa
; (Por lo general es el mismo nombre de la aplicación)
DefaultDirName={pf}\Maria - Morena Comercial 

;******************************************************************************************************************************************


;******************************************************************************************************************************************
; [Languages] y [Tasks]: No tocar o modificar las siguientes líneas
;******************************************************************************************************************************************
; [Languages] = Es el lenguaje por defecto
; [Tasks]     = Es la indicación para crear los íconos necesarios para iniciar el programa y para desinstalarlo
[Languages]
Name: "spanish"; MessagesFile: "compiler:Languages\Spanish.isl"

[Tasks]
Name: desktopicon; Description: Create a &desktop icon; GroupDescription: Additional icons:

;******************************************************************************************************************************************


;******************************************************************************************************************************************
; [Files]: Son los archivos que utilizaremos para crear el instalador
;******************************************************************************************************************************************
[Files]

; Nota: Los parámetros: Tienen que ir tal y como aparecen acá, solo cambiar las rutas C:\ en donde se encuentran los archivos
;       Otra cosa: {sys} = carpeta system de windows
;                  {win} = carpeta windows de windows
;                  {cf}  = carpeta archivos comunes de windows
;                  {tmp} = carpeta temporal de windows
;                  {app} = carpeta donde se va a instalar el programa (fue definida arriba en el parámetro: DefaultDirName= )
; -----------------------------------------------------------------------------------------------------------------------------------------
; Aquí van los archivos de la aplicación: El .exe y otros que ocupe el programa la aplicación
Source: D:\Mis cosas\I\Proyectos\Java\Maria - Sistema_de_negocios - FINANCIERA\- Compilar -\Crear exe a partir de jar\Maria - Comercial Morena.exe; DestDir: {app}; Flags: ignoreversion
Source: D:\Mis cosas\I\Proyectos\Java\Maria - Sistema_de_negocios - FINANCIERA\- Compilar -\Crear exe a partir de jar\*; DestDir: "{app}"; Flags: ignoreversion recursesubdirs createallsubdirs
;Source: C:\Users\Miki\Desktop\Compilar\Crear instalador\Complementos\ventafinanciera.sql*; DestDir: {tmp}; Flags : ignoreversion deleteafterinstall

;******************************************************************************************************************************************


; Omitir esta linea [INI] - No tocar o modificar la siguiente línea
[INI]


;******************************************************************************************************************************************
; [Icons]: Estos son los íconos que el instalador creara en el grupo de programas del sistema de Windows
;******************************************************************************************************************************************
[Icons]

; Nota: Aquí se incluye: El ícono para abrir el programa
;                        El ícono para desinstalar el programa
;                        El ícono que se ubica en el escritorio
; -----------------------------------------------------------------------------------------------------------------------------------------
; {group} = nombre del grupo de programa que se definió arriba en el parámetro: DefaultGroupName=
;           (Por lo general es el mismo nombre de la aplicación)
Name: {group}\Maria - Morena Comercial; Filename: {app}\Maria - Morena Comercial.exe; WorkingDir: {app}; IconIndex: 0
Name: {group}\Desinstalar Maria - Morena Comercial; Filename: {uninstallexe}
Name: {userdesktop}\Maria - Morena Comercial; Filename: {app}\Maria - Morena Comercial.exe; Tasks: desktopicon; WorkingDir: {app}; IconIndex: 0

;******************************************************************************************************************************************


;******************************************************************************************************************************************
; [Run]: Estos son los programas que se instalar como complementos de nuestra aplicación
;******************************************************************************************************************************************
[Run]

; Nota: Esto se ejecuta al momento de la instalación de nuestro programa

; Instalamos MySQL
; (Aquí tenemos que poner el nombre de nuestro motor de base de datos que se encuentra en nuestra carpeta complementos)
;Filename: {src}\complementos\mysql-workbench-community-6.3.8-winx64.exe; Parameters: "/q:a /C:""install /q"""; WorkingDir: {src}\complementos;

; Esto nos permite crear la base de datos
; (Aquí ponemos el nombre de nuestra base de datos y cambiamos nuestra ruta  C:\ si es necesario)
;Filename: C:\wamp\bin\mysql\mysql5.5.24\bin\mysql.exe; Parameters: "-u root -p2109 -h localhost -e ""create database ventafinanciera CHARACTER SET 'utf8' COLLATE utf8_spanish_ci";  WorkingDir: {tmp}; StatusMsg: Creando la Base dedatos; Flags: runhidden

; Cargamos la base de datos
; (Acedemos a nuestra base de datos, cargamos nuestras tablas coon nuestro arcchivo [.sql] y cambiamos nuestra ruta  C:\ si es necesario)
;Filename: C:\wamp\bin\mysql\mysql5.5.24\bin\mysql.exe; Parameters: "-u root -p2109 -h localhost -e ""use ventafinanciera; source ventafinanciera.sql;";  WorkingDir: {tmp}; StatusMsg: Creando Base de Datos; Flags: runhidden

;******************************************************************************************************************************************


;******************************************************************************************************************************************
; [Messages]: Estos mensajes simplemente son un override ya que vienen en inglés
;             (Cambia los valores de las etiquetas para que aparezcan con el nombre de tu aplicación)
;******************************************************************************************************************************************
[Messages]

; Este es el título que se mostrara al momento de iniciar el cuadro de dialogo de la instalación (Cambia el Nombre_Aplicación por el nombre de tu aplicacion)
WelcomeLabel1=Instalando "Maria - Sistema de negocios"

; Este es eñ titulo que se mostrara debajo del titulo (Cambia el Nombre_Aplicación por el nombre de tu aplicacion)
WelcomeLabel2=Este proceso instalará Maria - Sistema de negocios.%n%nSe recomienda cerrar todas las aplicaciones abiertas%nantes de continuar.

;******************************************************************************************************************************************