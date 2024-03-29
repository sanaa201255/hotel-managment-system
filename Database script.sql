USE [dmae0912_4]
GO
/****** Object:  User [dmae0912_4]    Script Date: 1.6.2013 г. 16:54:58 ч. ******/
CREATE USER [dmae0912_4] FOR LOGIN [dmae0912_4] WITH DEFAULT_SCHEMA=[dbo]
GO
ALTER ROLE [db_owner] ADD MEMBER [dmae0912_4]
GO
/****** Object:  Table [dbo].[Events]    Script Date: 1.6.2013 г. 16:54:58 ч. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Events](
	[eventId] [int] NOT NULL,
	[date] [date] NOT NULL,
	[timeFrom] [time](7) NOT NULL,
	[timeTo] [time](7) NOT NULL,
	[type] [varchar](50) NOT NULL,
	[description] [varchar](max) NOT NULL,
	[totalParticipants] [int] NOT NULL,
	[status] [varchar](50) NOT NULL,
	[staffId] [int] NOT NULL,
 CONSTRAINT [PK_Events] PRIMARY KEY CLUSTERED 
(
	[eventId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[EventsReservation]    Script Date: 1.6.2013 г. 16:54:58 ч. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[EventsReservation](
	[eventId] [int] NOT NULL,
	[guestId] [int] NOT NULL,
	[userStatus] [varchar](50) NOT NULL,
	[numberOfparticipants] [int] NULL,
PRIMARY KEY CLUSTERED 
(
	[eventId] ASC,
	[guestId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Facilities]    Script Date: 1.6.2013 г. 16:54:58 ч. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Facilities](
	[facilityId] [int] NOT NULL,
	[facilityType] [varchar](50) NOT NULL,
	[capacity] [int] NOT NULL,
	[facilityPrice] [numeric](18, 2) NOT NULL,
	[status] [varchar](50) NOT NULL,
	[staffId] [int] NULL,
 CONSTRAINT [PK_Facilities] PRIMARY KEY CLUSTERED 
(
	[facilityId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[FacilityLine]    Script Date: 1.6.2013 г. 16:54:58 ч. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[FacilityLine](
	[facilityLineId] [int] NOT NULL,
	[facilityId] [int] NOT NULL,
	[facilityDate] [date] NOT NULL,
	[facilityTime] [varchar](50) NOT NULL,
	[NoOfPersons] [int] NOT NULL,
	[reservationId] [int] NOT NULL,
	[instructor] [varchar](10) NULL,
 CONSTRAINT [PK_FacilityLine] PRIMARY KEY CLUSTERED 
(
	[facilityLineId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Guest]    Script Date: 1.6.2013 г. 16:54:58 ч. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Guest](
	[guestId] [int] NOT NULL,
	[travelAgencyId] [int] NULL,
 CONSTRAINT [PK_Guest] PRIMARY KEY CLUSTERED 
(
	[guestId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Packages]    Script Date: 1.6.2013 г. 16:54:58 ч. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Packages](
	[packageId] [int] NOT NULL,
	[discount] [numeric](18, 2) NOT NULL,
	[description] [varchar](50) NOT NULL,
	[status] [varchar](50) NULL,
 CONSTRAINT [PK_Packages] PRIMARY KEY CLUSTERED 
(
	[packageId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Reservation]    Script Date: 1.6.2013 г. 16:54:58 ч. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Reservation](
	[reservationId] [int] NOT NULL,
	[guestId] [int] NOT NULL,
	[totalPrice] [numeric](18, 2) NOT NULL,
	[status] [varchar](50) NOT NULL,
	[deposit] [numeric](18, 2) NOT NULL,
	[packageId] [int] NULL,
 CONSTRAINT [PK_Reservation] PRIMARY KEY CLUSTERED 
(
	[reservationId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[RoomLine]    Script Date: 1.6.2013 г. 16:54:58 ч. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[RoomLine](
	[reservationId] [int] NOT NULL,
	[roomId] [int] NOT NULL,
	[checkIn] [date] NOT NULL,
	[checkOut] [date] NOT NULL,
	[childrenNo] [int] NULL,
	[adultNo] [int] NOT NULL,
	[roomLineId] [int] NOT NULL,
 CONSTRAINT [PK_ReservationLine_1] PRIMARY KEY CLUSTERED 
(
	[roomLineId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
/****** Object:  Table [dbo].[Rooms]    Script Date: 1.6.2013 г. 16:54:58 ч. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Rooms](
	[roomId] [int] NOT NULL,
	[roomType] [varchar](50) NOT NULL,
	[status] [varchar](50) NOT NULL,
	[description] [varchar](50) NOT NULL,
	[price] [numeric](5, 2) NOT NULL,
	[lastClean] [date] NULL,
 CONSTRAINT [PK_Rooms] PRIMARY KEY CLUSTERED 
(
	[roomId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Staff]    Script Date: 1.6.2013 г. 16:54:58 ч. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Staff](
	[staffId] [int] NOT NULL,
	[position] [varchar](30) NOT NULL,
	[contractStart] [varchar](50) NOT NULL,
	[contractEnd] [varchar](50) NOT NULL,
	[salary] [numeric](18, 2) NOT NULL,
	[officePhone] [varchar](50) NULL,
 CONSTRAINT [PK_Staff] PRIMARY KEY CLUSTERED 
(
	[staffId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[TravelAgency]    Script Date: 1.6.2013 г. 16:54:58 ч. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[TravelAgency](
	[travelAgencyId] [int] NOT NULL,
	[companyId] [varchar](50) NOT NULL,
	[contractStart] [varchar](50) NOT NULL,
	[contractEnd] [varchar](50) NOT NULL,
	[commisson] [int] NOT NULL,
	[travelAgencyName] [varchar](50) NULL,
 CONSTRAINT [PK_TravelAgency] PRIMARY KEY CLUSTERED 
(
	[travelAgencyId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
/****** Object:  Table [dbo].[Users]    Script Date: 1.6.2013 г. 16:54:58 ч. ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
SET ANSI_PADDING ON
GO
CREATE TABLE [dbo].[Users](
	[userId] [int] NOT NULL,
	[fname] [varchar](50) NOT NULL,
	[lname] [varchar](50) NOT NULL,
	[address] [varchar](max) NOT NULL,
	[country] [varchar](50) NOT NULL,
	[city] [varchar](50) NOT NULL,
	[email] [varchar](50) NOT NULL,
	[phone] [varchar](50) NOT NULL,
	[username] [varchar](50) NOT NULL,
	[password] [varchar](50) NOT NULL,
	[cpr] [varchar](50) NULL,
	[type] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Users] PRIMARY KEY CLUSTERED 
(
	[userId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]

GO
SET ANSI_PADDING OFF
GO
ALTER TABLE [dbo].[Events]  WITH CHECK ADD  CONSTRAINT [FK_Events_Staff] FOREIGN KEY([staffId])
REFERENCES [dbo].[Staff] ([staffId])
GO
ALTER TABLE [dbo].[Events] CHECK CONSTRAINT [FK_Events_Staff]
GO
ALTER TABLE [dbo].[EventsReservation]  WITH CHECK ADD  CONSTRAINT [FK_EventsReservation_Events] FOREIGN KEY([eventId])
REFERENCES [dbo].[Events] ([eventId])
GO
ALTER TABLE [dbo].[EventsReservation] CHECK CONSTRAINT [FK_EventsReservation_Events]
GO
ALTER TABLE [dbo].[EventsReservation]  WITH CHECK ADD  CONSTRAINT [FK_EventsReservation_Guest] FOREIGN KEY([guestId])
REFERENCES [dbo].[Guest] ([guestId])
GO
ALTER TABLE [dbo].[EventsReservation] CHECK CONSTRAINT [FK_EventsReservation_Guest]
GO
ALTER TABLE [dbo].[Facilities]  WITH CHECK ADD  CONSTRAINT [FK_Facilities_Staff] FOREIGN KEY([staffId])
REFERENCES [dbo].[Staff] ([staffId])
GO
ALTER TABLE [dbo].[Facilities] CHECK CONSTRAINT [FK_Facilities_Staff]
GO
ALTER TABLE [dbo].[FacilityLine]  WITH CHECK ADD  CONSTRAINT [FK_FacilityLine_FacilityLine] FOREIGN KEY([facilityId])
REFERENCES [dbo].[Facilities] ([facilityId])
GO
ALTER TABLE [dbo].[FacilityLine] CHECK CONSTRAINT [FK_FacilityLine_FacilityLine]
GO
ALTER TABLE [dbo].[FacilityLine]  WITH CHECK ADD  CONSTRAINT [FK_FacilityLine_Reservation] FOREIGN KEY([reservationId])
REFERENCES [dbo].[Reservation] ([reservationId])
GO
ALTER TABLE [dbo].[FacilityLine] CHECK CONSTRAINT [FK_FacilityLine_Reservation]
GO
ALTER TABLE [dbo].[Guest]  WITH CHECK ADD  CONSTRAINT [FK_Guest_TravelAgency] FOREIGN KEY([travelAgencyId])
REFERENCES [dbo].[TravelAgency] ([travelAgencyId])
GO
ALTER TABLE [dbo].[Guest] CHECK CONSTRAINT [FK_Guest_TravelAgency]
GO
ALTER TABLE [dbo].[Guest]  WITH CHECK ADD  CONSTRAINT [FK_Guest_Users] FOREIGN KEY([guestId])
REFERENCES [dbo].[Users] ([userId])
GO
ALTER TABLE [dbo].[Guest] CHECK CONSTRAINT [FK_Guest_Users]
GO
ALTER TABLE [dbo].[Reservation]  WITH CHECK ADD  CONSTRAINT [FK_Reservation_Guest] FOREIGN KEY([guestId])
REFERENCES [dbo].[Guest] ([guestId])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Reservation] CHECK CONSTRAINT [FK_Reservation_Guest]
GO
ALTER TABLE [dbo].[Reservation]  WITH CHECK ADD  CONSTRAINT [FK_Reservation_Packages] FOREIGN KEY([packageId])
REFERENCES [dbo].[Packages] ([packageId])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Reservation] CHECK CONSTRAINT [FK_Reservation_Packages]
GO
ALTER TABLE [dbo].[RoomLine]  WITH CHECK ADD  CONSTRAINT [FK_RoomLine_Reservation] FOREIGN KEY([reservationId])
REFERENCES [dbo].[Reservation] ([reservationId])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[RoomLine] CHECK CONSTRAINT [FK_RoomLine_Reservation]
GO
ALTER TABLE [dbo].[RoomLine]  WITH CHECK ADD  CONSTRAINT [FK_RoomLine_Rooms] FOREIGN KEY([roomId])
REFERENCES [dbo].[Rooms] ([roomId])
GO
ALTER TABLE [dbo].[RoomLine] CHECK CONSTRAINT [FK_RoomLine_Rooms]
GO
ALTER TABLE [dbo].[Staff]  WITH CHECK ADD  CONSTRAINT [FK_Staff_Users] FOREIGN KEY([staffId])
REFERENCES [dbo].[Users] ([userId])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Staff] CHECK CONSTRAINT [FK_Staff_Users]
GO
ALTER TABLE [dbo].[TravelAgency]  WITH CHECK ADD  CONSTRAINT [FK_TravelAgency_Users] FOREIGN KEY([travelAgencyId])
REFERENCES [dbo].[Users] ([userId])
GO
ALTER TABLE [dbo].[TravelAgency] CHECK CONSTRAINT [FK_TravelAgency_Users]
GO
