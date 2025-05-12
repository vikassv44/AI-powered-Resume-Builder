import google.generativeai as genai

genai.configure(api_key="AIzaSyBYo1t0alK0CBPfxae1ruyvhyP2tE-rDJ0")

# Check available models
models = list(genai.list_models())  # Convert the generator to a list

# Print all available models
for model in models:
    print(model)
