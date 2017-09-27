public class monster
	{

			public String name;
			public String persuasion;
			
			public monster (String n, String p)
			{
				name = n;
				persuasion = p;
				
			}
			public String getName()
				{
					return name;
				}
			public void setName(String name)
				{
					this.name = name;
				}
			public String getPersuasion()
				{
					return persuasion;
				}
			public void setPower(String power)
				{
					this.persuasion = power;
				}
	}
